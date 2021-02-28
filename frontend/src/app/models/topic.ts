import { Material } from './material';
import { Task } from './task';

export class Topic {
    id: string = '';
    name: string = '';
    materialsScore: number = 0;
    tasksScore: number = 0;
    score: number = 0;
    materials: Material[] = [];
    tasks: Task[] = [];
  }
