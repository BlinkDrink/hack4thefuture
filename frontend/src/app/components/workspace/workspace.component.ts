import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute, Data, Params, Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { Workspace } from 'src/app/models/workspace';
import { WorkspaceListResolverService } from 'src/app/resolvers/workspace-list-resolver.service';

@Component({
  selector: 'app-workspace',
  templateUrl: './workspace.component.html',
  styleUrls: ['./workspace.component.scss']
})
export class WorkspaceComponent implements OnDestroy {

  workspace: Workspace | undefined;

  private workspaceId: string = '';
  private workspaceId$: Subscription;
  private workspaces: Workspace[] = [];
  private workspaces$: Subscription;

  constructor(private route: ActivatedRoute) {
    this.workspaces$ = this.route.data.subscribe((data: Params) => {
      this.workspaces = data['workspaces'];
    });

    this.workspaceId$ = this.route.params.subscribe((params: Params) => {
      this.workspaceId = params['id'];
      this.workspace = this.workspaces.find(w => w.id === this.workspaceId);
    });
  }

  ngOnDestroy(): void {
    this.workspaceId$.unsubscribe();
    this.workspaces$.unsubscribe();
  }
}
