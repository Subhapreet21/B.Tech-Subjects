import { LightningElement, api, wire } from 'lwc';
import getEventDetails from '@salesforce/apex/EventService.getEventDetails';

export default class EventDetail extends LightningElement {
    @api eventId;        // Event ID passed from parent component or URL
    event;               // Will hold event details
    error;               // To capture any errors

    @wire(getEventDetails, { eventId: '$eventId' })
    wiredEvent({ data, error }) {
        if (data) {
            this.event = data;
            this.error = undefined;
        } else if (error) {
            this.error = error;
            this.event = undefined;
            console.error('Error fetching event details:', error);
        }
    }

    // Getter to determine if registration is open
    get isRegistrationOpen() {
        return this.event && this.event.Total_Attendees__c < this.event.Max_Attendees__c;
    }

    // Handle register event, could trigger opening a registration form
    handleRegister() {
        if (this.isRegistrationOpen) {
            // Dispatch a custom event to the parent component to handle registration logic
            this.dispatchEvent(new CustomEvent('register', { detail: { eventId: this.event.Id } }));
        } else {
            alert('Registration is closed for this event.');
        }
    }

    // Optional: A helper method to show a friendly error message if there's an issue fetching the data
    get errorMessage() {
        return this.error ? 'There was an error fetching the event details. Please try again later.' : '';
    }
}
