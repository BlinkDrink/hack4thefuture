import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HelpSomeoneComponent } from './components/help-someone/help-someone.component';
import { HomeComponent } from './components/home/home.component';
import { WorkspaceResolverService } from './resolvers/workspace-resolver.service';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
    resolve: {
      workspaces: WorkspaceResolverService
    },
  },
  { path: 'help-someone', component: HelpSomeoneComponent },
  { path: 'test', component: HelpSomeoneComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
