import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Material } from 'src/app/models/material';
import { Topic } from 'src/app/models/topic';
import { Workspace } from 'src/app/models/workspace';

@Component({
  selector: 'app-material',
  templateUrl: './material.component.html',
  styleUrls: ['./material.component.scss']
})
export class MaterialComponent implements OnInit {

  workspace: Workspace | undefined;
  topic: Topic | undefined;
  material: Material | undefined;

  options = [
    { value: 'This is value 1', label: 'Option 1' },
    { value: 'This is value 2', label: 'Option 2' },
    { value: 'This is value 3', label: 'Option 3' },
    { value: 'This is value 4', label: 'Option 4' },
    { value: 'This is value 5', label: 'Option 5' }
  ];

  constructor(private route: ActivatedRoute) {
    const workspaceId = this.route.snapshot.params.workspaceId;
    const topicId = this.route.snapshot.params.topicId;
    const materialId = this.route.snapshot.params.materialId;
    this.workspace = this.route.snapshot.data.workspaces.find((w: Workspace) => w.id === workspaceId);
    this.topic = this.workspace?.topics.find(t => t.id === topicId);
    this.material = this.topic?.materials.find(m => m.id === materialId);
  }

  ngOnInit(): void {
  }

}
