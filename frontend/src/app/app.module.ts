import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NbThemeModule, NbLayoutModule, NbSidebarModule, NbButtonModule,
         NbIconModule, NbMenuModule, NbButtonGroupModule,
         NbListModule, NbActionsModule, NbCardModule, NbSearchModule, NbRadioModule, NbBadgeModule
       } from '@nebular/theme';
import { NbEvaIconsModule } from '@nebular/eva-icons';
import { WorkspaceComponent } from './components/workspace/workspace.component';
import { HelpSomeoneComponent } from './components/help-someone/help-someone.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { WorkspaceService } from './services/workspace.service';
import { HttpClientModule } from '@angular/common/http';
import { RouterComponent } from './components/router/router.component';
import { InMemoryDataService } from './services/in-memory-data.service';
import { HttpClientInMemoryWebApiModule } from 'angular-in-memory-web-api';
import { NgxSpinnerModule } from 'ngx-spinner';
import { TrackProgressComponent } from './track-progress/track-progress.component';
import { MaterialDetailComponent } from './material-detail/material-detail.component';
import { TopicComponent } from './components/topic/topic.component';
import { MaterialComponent } from './components/material/material.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    WorkspaceComponent,
    HelpSomeoneComponent,
    SidebarComponent,
    RouterComponent,
    TrackProgressComponent,
    MaterialDetailComponent,
    TopicComponent,
    MaterialComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    HttpClientInMemoryWebApiModule.forRoot(InMemoryDataService, { delay: 0 }),
    FormsModule,
    NgxSpinnerModule,
    NbThemeModule.forRoot({ name: 'default' }),
    NbLayoutModule,
    NbEvaIconsModule,
    NbLayoutModule,
    NbSidebarModule.forRoot(),
    NbButtonModule,
    NbEvaIconsModule,
    NbIconModule,
    NbMenuModule.forRoot(),
    NbButtonGroupModule,
    NbListModule,
    NbActionsModule,
    NbCardModule,
    NbSearchModule,
    NbRadioModule,
    NbBadgeModule
  ],
  providers: [
    InMemoryDataService,
    WorkspaceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
