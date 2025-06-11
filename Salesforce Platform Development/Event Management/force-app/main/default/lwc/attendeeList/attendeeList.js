import { LightningElement, api, wire } from 'lwc';
import getAttendeesByEvent from '@salesforce/apex/AttendeeService.getAttendeesByEvent';

const COLUMNS = [
    { label: 'Name', fieldName: 'Name' },
    { label: 'Email', fieldName: 'Email__c', type: 'email' },
    { label: 'Phone', fieldName: 'Phone_Number__c', type: 'phone' }
];

export default class AttendeeList extends LightningElement {
    @api eventId;
    columns = COLUMNS;
    attendees;

    @wire(getAttendeesByEvent, { eventId: '$eventId' })
    wiredAttendees({ data, error }) {
        if (data) {
            this.attendees = data;
        } else if (error) {
            console.error('Error fetching attendees:', error);
        }
    }
}
