import { LightningElement, wire } from 'lwc';
import getOrderSummary from '@salesforce/apex/OrderController.getOrderSummary';

export default class OrderSummary extends LightningElement {
    orderSummary = [];

    @wire(getOrderSummary)
    wiredSummary({ data, error }) {
        if (data) {
            this.orderSummary = data;
        } else if (error) {
            console.error(error);
        }
    }
}
