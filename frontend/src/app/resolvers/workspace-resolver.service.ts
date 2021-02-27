import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Resolve, RouterStateSnapshot } from '@angular/router';
import { WorkspaceService } from '../services/workspace.service';

@Injectable({
  providedIn: 'root'
})
export class WorkspaceResolverService implements Resolve<any> {

  constructor(private workspaceService: WorkspaceService) {

  }

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    return this.workspaceService.getAll();
  }
}
