import { LightningElement, api, track } from 'lwc';
import createOrder from '@salesforce/apex/OrderController.createOrder';

export default class QuickOrderCreation extends LightningElement {
    @api customerId;
    @track orderName = '';
    @track orderDate = '';
    @track orderStatus = '';

    // Status options for the picklist
    statusOptions = [
        { label: 'New', value: 'New' },
        { label: 'Processing', value: 'Processing' },
        { label: 'Shipped', value: 'Shipped' },
        { label: 'Delivered', value: 'Delivered' },
    ];

    handleOrderNameChange(event) {
        this.orderName = event.target.value;
    }

    handleOrderDateChange(event) {
        this.orderDate = event.target.value;
    }

    handleOrderStatusChange(event) {
        this.orderStatus = event.target.value;
    }

    // Create order and call Apex method
    createOrder() {
        const orderData = {
            customerId: this.customerId,
            orderName: this.orderName,
            orderDate: this.orderDate,
            orderStatus: this.orderStatus
        };

        createOrder({ orderData })
            .then(result => {
                console.log('Order created with ID:', result);
                // Optionally add success handling here
            })
            .catch(error => {
                console.error('Error creating order:', error);
                // Optionally add error handling here
            });
    }
}
