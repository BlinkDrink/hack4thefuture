import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HelpSomeoneComponent } from './components/help-someone/help-someone.component';
import { HomeComponent } from './components/home/home.component';
import { RouterComponent } from './components/router/router.component';
import { WorkspaceComponent } from './components/workspace/workspace.component';
import { WorkspaceListResolverService } from './resolvers/workspace-list-resolver.service';
import { TrackProgressComponent } from './track-progress/track-progress.component';
import { MaterialDetailComponent } from './material-detail/material-detail.component';
import { TopicComponent } from './components/topic/topic.component';
import { MaterialComponent } from './components/material/material.component';

const routes: Routes = [
  {
    path: '',
    component: RouterComponent,
    resolve: { workspaces: WorkspaceListResolverService },
    children: [
      {
        path: '',
        component: HomeComponent,
        resolve: { workspaces: WorkspaceListResolverService } // WorkspaceResolverService }
      },
      {
        path: 'workspaces/:workspaceId',
        component: WorkspaceComponent,
        resolve: { workspaces: WorkspaceListResolverService } // WorkspaceResolverService }
      },
      {
        path: 'workspaces/:workspaceId/topics/:topicId',
        component: TopicComponent,
        resolve: { workspaces: WorkspaceListResolverService } // WorkspaceResolverService }
      },
      {
        path: 'workspaces/:workspaceId/topics/:topicId/materials/:materialId',
        component: MaterialComponent,
        resolve: { workspaces: WorkspaceListResolverService } // WorkspaceResolverService }
      },
      { path: 'track-progress', component: TrackProgressComponent },
      {
        path: 'help-someone',
        component: HelpSomeoneComponent,
        resolve: { workspaces: WorkspaceListResolverService } // WorkspaceResolverService }
      },
      { path: '**', redirectTo: '', pathMatch: 'full' }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
