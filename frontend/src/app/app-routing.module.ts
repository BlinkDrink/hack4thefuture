import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HelpSomeoneComponent } from './components/help-someone/help-someone.component';
import { HomeComponent } from './components/home/home.component';
import { RouterComponent } from './components/router/router.component';
import { WorkspaceComponent } from './components/workspace/workspace.component';
import { WorkspaceListResolverService } from './resolvers/workspace-list-resolver.service';
import { TrackProgressComponent } from './track-progress/track-progress.component';

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
        path: 'workspaces/:id',
        component: WorkspaceComponent,
        resolve: { workspaces: WorkspaceListResolverService } // WorkspaceResolverService }
      },
      { path: 'track-progress', component: TrackProgressComponent },
      { path: 'help-someone', component: HelpSomeoneComponent },
      { path: '**', redirectTo: '', pathMatch: 'full' }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
