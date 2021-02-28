import { Material } from './material';
import { Task } from './task';

export class Topic {
    id: string = '';
    name: string = '';
    score: number = 0;
    materials: Material[] = [];
    tasks: Task[] = [];
  }
