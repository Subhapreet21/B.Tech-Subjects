import { LightningElement, wire } from 'lwc';
import getUpcomingEvents from '@salesforce/apex/EventService.getUpcomingEvents';

export default class EventList extends LightningElement {
    events;

    @wire(getUpcomingEvents)
    wiredEvents({ data, error }) {
        if (data) {
            this.events = data;
        } else if (error) {
            console.error('Error fetching events:', error);
        }
    }

    handleViewDetails(event) {
        const eventId = event.target.dataset.id;
        // Dispatch a custom event to notify parent component
        this.dispatchEvent(new CustomEvent('viewdetails', { detail: { eventId } }));
    }
}
