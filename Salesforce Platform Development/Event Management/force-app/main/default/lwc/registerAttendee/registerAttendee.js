import { LightningElement, track, wire } from 'lwc';
import registerAttendee from '@salesforce/apex/AttendeeService.registerAttendee';
import getEvents from '@salesforce/apex/EventService.getEvents'; // This should be an Apex method to get events

export default class RegisterAttendee extends LightningElement {
    @track attendeeName = '';
    @track email = '';
    @track phone = '';
    @track selectedEventId = ''; // To store selected event Id
    @track successMessage = '';
    @track errorMessage = '';
    @track eventOptions = []; // Stores event options for combobox

    // Get the list of events when the component is loaded
    @wire(getEvents)
    wiredEvents({ data, error }) {
        if (data) {
            this.eventOptions = data.map(event => ({
                label: event.Name, // Display name of the event
                value: event.Id // Use Id as the value to track the selected event
            }));
        } else if (error) {
            this.errorMessage = 'Error fetching events: ' + error.body.message;
        }
    }

    // Handle input changes for the attendee details
    handleInputChange(event) {
        const field = event.target.dataset.field;
        this[field] = event.target.value;
    }

    // Handle the selection of an event
    handleEventChange(event) {
        this.selectedEventId = event.target.value;
    }

    // Handle the submission of the form
    async handleSubmit() {
        if (!this.selectedEventId) {
            this.errorMessage = 'Please select an event.';
            return;
        }

        try {
            const result = await registerAttendee({
                attendeeName: this.attendeeName,
                email: this.email,
                phone: this.phone,
                eventId: this.selectedEventId
            });
            this.successMessage = result;
            this.clearFields();
        } catch (error) {
            console.error('Error registering attendee:', error);
            this.errorMessage = 'Error registering attendee: ' + error.body.message;
        }
    }

    // Clear input fields after successful registration
    clearFields() {
        this.attendeeName = '';
        this.email = '';
        this.phone = '';
        this.selectedEventId = '';
    }
}
