import { Component, OnInit } from '@angular/core';
import { NbDialogRef } from '@nebular/theme';

@Component({
  selector: 'app-chat-dialog',
  templateUrl: './chat-dialog.component.html',
  styleUrls: ['./chat-dialog.component.scss']
})
export class ChatDialogComponent implements OnInit {

  messages: any[] = [];

  constructor(private dialogRef: NbDialogRef<any>) { }

  ngOnInit(): void {
  }

  close() {
    this.dialogRef.close();
  }

  sendMessage(event: any) {
    /*const files = !event.files ? [] : event.files.map((file) => {
      return {
        url: file.src,
        type: file.type,
        icon: 'file-text-outline',
      };
    });*/

    this.messages.push({
      text: event.message,
      date: new Date(),
      reply: true,
      type: 'text',
      user: {
        name: 'Jonh Doe',
        avatar: 'https://i.gifer.com/no.gif',
      },
    });
    /*const botReply = this.chatShowcaseService.reply(event.message);
    if (botReply) {
      setTimeout(() => { this.messages.push(botReply) }, 500);
    }*/
  }

}
