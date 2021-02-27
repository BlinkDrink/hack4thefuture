import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AppConfiguration } from '../app.configuration';

@Injectable({
  providedIn: 'root'
})
export class WorkspaceService {

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get(`${AppConfiguration.API_ENDPOINT}/workspaces`);
  }
}
