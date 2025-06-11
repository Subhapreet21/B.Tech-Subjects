import { LightningElement, wire } from 'lwc';
import getLowStockProducts from '@salesforce/apex/InventoryController.getLowStockProducts';

export default class LowStockAlert extends LightningElement {
    lowStockProducts = [];

    @wire(getLowStockProducts)
    wiredProducts({ data, error }) {
        if (data) {
            this.lowStockProducts = data;
        } else if (error) {
            console.error(error);
        }
    }
}
