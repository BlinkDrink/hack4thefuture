import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Data } from '@angular/router';
import { Subscription } from 'rxjs';
import { HelpUser } from 'src/app/models/helpuser';
import { Topic } from 'src/app/models/topic';
import { Workspace } from 'src/app/models/workspace';

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
        name: 'Array data structure',
        link: 'https://en.wikipedia.org/wiki/Array_data_structure',
        questions: [],
        score: 0
      },
      question: 'What is index?'
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
      },
      question: 'How does the executed program know where to look for the dynamically allocated variables in memory?'
    },
    {
      user: {
        name: 'Petkan'
      },
      material: {
        id: '95f0eb44-d1bc-4058-a9f2-35cfa1505611',
        name: 'Understanding Move Semantics and Perfect Forwarding: Part 1',
        link: 'https://drewcampbell92.medium.com/understanding-move-semantics-and-perfect-forwarding-987cf4dc7e27',
        questions: [],
        score: 30
      },
      question: 'I don\'t understand templates, help!'
    }
  ];

  private workspaces: Workspace[] = [];
  private workspaces$: Subscription;

  materialWorkspaceTopicMap: {[key: string]: {
    workspace: Workspace | undefined,
    topic: Topic | undefined
  }} = {};

  constructor(private route: ActivatedRoute) {
    this.workspaces$ = this.route.data.subscribe((data: Data) => {
      this.workspaces = data.workspaces;
    });
  }

  ngOnInit(): void {
    this.helpUsers.forEach(hu => {
      const workspace: Workspace | undefined = this.workspaces.
                                        find(ws => ws.topics
                                          .some(t => t.materials.some(m => m.id === hu.material.id)));
      const topic: Topic | undefined = workspace?.topics.find(t => t.materials.some(m => m.id === hu.material.id));
      this.materialWorkspaceTopicMap[hu.material.id] = { workspace, topic };
    });

  }

}
