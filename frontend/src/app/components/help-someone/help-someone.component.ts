import { Component, OnInit } from '@angular/core';
import { HelpUser } from 'src/app/models/helpuser';

@Component({
  selector: 'app-help-someone',
  templateUrl: './help-someone.component.html',
  styleUrls: ['./help-someone.component.scss']
})
export class HelpSomeoneComponent implements OnInit {

  helpUsers: HelpUser[] = [
    {
      user: {
        name: 'Petar'
      },
      material: {
        id: '3a94f370-e5fe-4fb0-ad1d-598bd5308214',
        name: 'Arrays',
        link: 'https://en.wikipedia.org/wiki/Array_data_structure',
        questions: [],
        score: 0
      }
    },
    {
      user: {
        name: 'Georgi'
      },
      material: {
        id: '1b2c214f-e255-4e05-bfdb-f0026be3cc69',
        name: 'Dynamic memory',
        link: 'https://www.cplusplus.com/doc/tutorial/dynamic/',
        questions: [],
        score: 20
      }
    },
    {
      user: {
        name: 'Petkan'
      },
      material: {
        id: '95f0eb44-d1bc-4058-a9f2-35cfa1505611',
        name: 'Functions',
        link: 'https://www.cplusplus.com/doc/tutorial/functions/',
        questions: [],
        score: 30
      }
    }
  ];

  constructor() { }

  ngOnInit(): void {

  }

}
