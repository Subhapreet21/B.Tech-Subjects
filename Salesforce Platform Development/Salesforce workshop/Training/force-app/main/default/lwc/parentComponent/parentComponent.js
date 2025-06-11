import { LightningElement } from 'lwc';

export default class ParentComponent extends LightningElement {
  messageFromChild = '';

  handleCustomMessage(event) {
    this.messageFromChild = event.detail;
  }
}
