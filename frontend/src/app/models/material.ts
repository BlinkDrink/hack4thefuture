import { Question } from './question';

export class Material {
    id: string = '';
    name: string = '';
    link: string = '';
    score: number = 0;
    questions: Question[] = [];
  }