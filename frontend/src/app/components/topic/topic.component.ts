import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute, Data, Params } from '@angular/router';
import { Topic } from 'src/app/models/topic';
import { Workspace } from 'src/app/models/workspace';

@Component({
  selector: 'app-topic',
  templateUrl: './topic.component.html',
  styleUrls: ['./topic.component.scss']
})
export class TopicComponent {

  workspace: Workspace | undefined;
  topic: Topic | undefined;

  constructor(private route: ActivatedRoute) {
    const workspaceId = this.route.snapshot.params.workspaceId;
    const topicId = this.route.snapshot.params.topicId;
    this.workspace = this.route.snapshot.data.workspaces.find((w: Workspace) => w.id === workspaceId);
    this.topic = this.workspace?.topics.find(t => t.id === topicId);
  }

}
