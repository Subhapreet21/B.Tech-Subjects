import { LightningElement } from 'lwc';

export default class ButtonClick extends LightningElement {
  message = 'Hello, World!';

  handleButtonClick() {
    this.message = 'Button was clicked!';
  }
}
