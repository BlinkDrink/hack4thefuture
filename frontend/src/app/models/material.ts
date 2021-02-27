import { Question } from "./question";
import { Task } from "./task";

export class Material {
    id: string = '';
    name: string = '';
    link: string = '';
    questions: Question[] = [];
  }