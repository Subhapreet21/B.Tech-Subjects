import { LightningElement } from 'lwc';
export default class HelloWorld extends LightningElement {
    mssg = 'World';
    handleChange(event) {
        this.mssg = event.target.value;
    }
}