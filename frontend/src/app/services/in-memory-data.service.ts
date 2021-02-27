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
        id: 'e6294653-5bef-4d47-8b48-c6750f5e8be5',
        name: 'OOP'
      }, {
        id: 'a558b348-db33-4d77-be5d-e38dd49fe295',
        name: 'Chinese'
      }
    ];

    return {
      workspaces
    };
  }
}
