import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute, Data, Params, Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { Topic } from 'src/app/models/topic';
import { Workspace } from 'src/app/models/workspace';

@Component({
  selector: 'app-workspace',
  templateUrl: './workspace.component.html',
  styleUrls: ['./workspace.component.scss']
})
export class WorkspaceComponent implements OnDestroy {

  workspace: Workspace | undefined;
  topics: Topic[] = [];

  private workspaceId = '';
  private workspaceId$: Subscription;
  private workspaces: Workspace[] = [];
  private workspaces$: Subscription;

  constructor(private route: ActivatedRoute) {
    this.workspaces$ = this.route.data.subscribe((data: Data) => {
      this.workspaces = data.workspaces;
    });

    this.workspaceId$ = this.route.params.subscribe((params: Params) => {
      this.workspaceId = params.workspaceId;
      this.workspace = this.workspaces.find(w => w.id === this.workspaceId);
      this.topics = this.workspace?.topics ?? [];
    });
  }

  ngOnDestroy(): void {
    this.workspaceId$.unsubscribe();
    this.workspaces$.unsubscribe();
  }
}
