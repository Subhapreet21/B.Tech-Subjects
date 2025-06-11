import { LightningElement } from 'lwc';
export default class ChildComponent extends LightningElement {
    sendMessage() {
        const message = 'Hello from Child!';
        const event = new CustomEvent('custommessage', {
            detail: message
        });
        this.dispatchEvent(event);
    }
}
