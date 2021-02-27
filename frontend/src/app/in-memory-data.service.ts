import { Injectable } from '@angular/core';
import { InMemoryDbService, RequestInfo } from 'angular-in-memory-web-api';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InMemoryDataService implements InMemoryDbService {

  constructor() { }

  createDb(reqInfo?: RequestInfo): {} | Observable<{}> | Promise<{}> {
    const workspaces = [
      {
        title: 'Test',
        link: '/test',
        badge: {
          text: '26',
          status: 'primary',
        }
      }, {
        title: 'Test2',
        link: '/test2',
        badge: {
          text: '4',
          status: 'primary',
        },
      }
    ];

    return {
      workspaces
    };
  }
}
