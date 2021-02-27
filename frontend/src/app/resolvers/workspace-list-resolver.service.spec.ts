import { TestBed } from '@angular/core/testing';

import { WorkspaceListResolverService } from './workspace-list-resolver.service';

describe('WorkspaceResolverService', () => {
  let service: WorkspaceListResolverService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WorkspaceListResolverService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
