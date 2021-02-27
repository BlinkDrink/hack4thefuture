import { Component, Input, OnInit } from '@angular/core';
import { NbMenuItem } from '@nebular/theme';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent implements OnInit {

  @Input()
  workspaces: NbMenuItem[] = [];

  topMenuItems: NbMenuItem[] = [];
  bottomMenuItems: NbMenuItem[] = [];

  ngOnInit(): void {
    this.topMenuItems = [
      {
        title: 'Your Workspaces',
        expanded: true,
        children: this.workspaces.length > 0 ? this.workspaces : undefined,
        badge: {
          text: this.workspaces.length.toString(),
          status: 'primary'
        },
        icon: 'grid-outline'
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
        badge: {
          text: '26',
          status: 'success',
        },
        icon: 'smiling-face-outline'
      }
    ]
  }
}
