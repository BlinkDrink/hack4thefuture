import { Component, Input, OnInit } from '@angular/core';
import { NbMenuItem } from '@nebular/theme';
import { Workspace } from 'src/app/models/workspace';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent implements OnInit {

  @Input()
  workspaces: Workspace[] = [];

  topMenuItems: NbMenuItem[] = [];
  bottomMenuItems: NbMenuItem[] = [];

  ngOnInit(): void {
    this.topMenuItems = [
      {
        title: 'Your Workspaces',
        icon: 'grid-outline',
        expanded: true,
        children: this.workspaces.length > 0 ? this.workspaces.map(workspace => ({
          title: workspace.name,
          link: `/workspaces/${workspace.id}`,
          badge: {
            text: 'x',
            status: 'primary'
          }
        })) : undefined,
        badge: {
          text: this.workspaces.length.toString(),
          status: 'primary',
        }
      }
    ];

    this.bottomMenuItems = [
      {
        title: 'Track Progress',
        link: '/track-progress',
        icon: 'bulb-outline'
      }, {
        title: 'Help Someone',
        link: '/help-someone',
        icon: 'smiling-face-outline',
        badge: {
          text: '26',
          status: 'success',
        }
      }
    ];
  }
}
