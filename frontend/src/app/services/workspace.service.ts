import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Configuration } from '../configuration/configuration';

@Injectable({
  providedIn: 'root'
})
export class WorkspaceService {

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get(`${Configuration.API_ENDPOINT}/workspaces`);
  }
}
