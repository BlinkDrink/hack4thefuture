import { Injectable } from '@angular/core';
import { InMemoryDbService, RequestInfo } from 'angular-in-memory-web-api';
import { Observable } from 'rxjs';
import { Workspace } from '../models/workspace';

@Injectable({
  providedIn: 'root'
})
export class InMemoryDataService implements InMemoryDbService {

  constructor() { }

  createDb(reqInfo?: RequestInfo): {} | Observable<{}> | Promise<{}> {
    const workspaces: Workspace[] = [
      {
        id: 'e6294653-5bef-4d47-8b48-c6750f5e8be5',
        name: 'OOP',
        topics: [
          {
            id: 'e58894fa-558c-41cb-aace-d2eb87c38513',
            name: 'Big Four',
            materials: [
              {
                id: 'ed1d358e-945c-4869-9111-1b81e238f98a',
                name: '(C++) Big Four - Richel Bilderbeek',
                link: 'https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiK1LTu94rvAhVV8OAKHR3VBUwQFjAAegQIARAD&url=http%3A%2F%2Fwww.richelbilderbeek.nl%2FCppBigFour.htm&usg=AOvVaw25EwmRLo_iRS8fdJTKBg9u',
                questions: [
                  {
                    id: 'afa70ec4-430b-40d1-a85c-4a621fa42501',
                    text: 'Which of those isn\'t of the big four',
                    answers: [
                      {
                        text: 'Constructor',
                        explanation: 'it is.',
                        isCorrect: true
                      },
                      {
                        text: 'Alpaca',
                        explanation: 'tempting, but no.',
                        isCorrect: false
                      },
                      {
                        text: 'Destructor',
                        explanation: 'it is.',
                        isCorrect: true
                      }
                    ]
                  }
                ],
                score: 100
              },
              {
                id: '9420e73b-48a6-471d-b25d-9d14942e4342',
                name: 'What is the Rule of Four (and a half)?',
                link: 'https://stackoverflow.com/questions/45754226/what-is-the-rule-of-four-and-a-half',
                questions: [
                  {
                    id: '828882bb-28b0-4eab-bed8-1fdd13ad50af',
                    text: 'What does the rule of four and a half state.',
                    answers: [
                      {
                        text: 'That if you implement one of the of the big four functions, move constructor or a swap operator, you need to override the rest, as well',
                        explanation: 'Or they might not work correctly (assignment operator sometimes calls copy constructor as an optimization, for example).',
                        isCorrect: true
                      }, {
                        text: 'Alpaca',
                        explanation: 'This should have been the right answer.',
                        isCorrect: false
                      }, {
                        text: 'Destructor',
                        explanation: 'This is from a different question.',
                        isCorrect: false
                      }
                    ]
                  }
                ],
                score: 0,
              }
            ],
            tasks: [
              {
                id: '8ef97095-c86b-424c-aa64-4bb879100fbd',
                name: 'Java Inheritance I',
                link: 'https://www.hackerrank.com/challenges/java-inheritance-1',
                score: 76
              }, {
                id: '334082e6-27b5-47f7-89ee-a4e0aaca86c5',
                name: 'Java Inheritance II',
                link: 'https://www.hackerrank.com/challenges/java-inheritance-2',
                score: 53
              }, {
                id: 'ff2dc67a-16ea-4ebe-bf04-4ecdf35ab001',
                name: 'Java Abstract Class',
                link: 'https://www.hackerrank.com/challenges/java-abstract-class',
                score: 21
              }
            ],
            materialsScore: 76,
            tasksScore: 24,
            score: 50
          },
          {
            id: 'b6ec13fb-3c6d-41e7-828c-f8e752154330',
            name: 'Virtual functions',
            materials: [],
            tasks: [],
            materialsScore: 100,
            tasksScore: 100,
            score: 100
          },
          {
            id: 'b6ec13fb-3c6d-41e7-828c-f8e752154330',
            name: 'Basics',
            materials: [
              {
                id: '1b2c214f-e255-4e05-bfdb-f0026be3cc69',
                name: 'Dynamic memory',
                link: 'https://www.cplusplus.com/doc/tutorial/dynamic/',
                questions: [],
                score: 20
              },
              {
                id: '3a94f370-e5fe-4fb0-ad1d-598bd5308214',
                name: 'Array data structure',
                link: 'https://en.wikipedia.org/wiki/Array_data_structure',
                questions: [],
                score: 0
              },
              {
                id: '95f0eb44-d1bc-4058-a9f2-35cfa1505611',
                name: 'Understanding Move Semantics and Perfect Forwarding: Part 1',
                link: 'https://drewcampbell92.medium.com/understanding-move-semantics-and-perfect-forwarding-987cf4dc7e27',
                questions: [],
                score: 30
              }
            ],
            tasks: [],
            materialsScore: 100,
            tasksScore: 100,
            score: 100
          }
        ]
      }, {
        id: 'a558b348-db33-4d77-be5d-e38dd49fe295',
        name: 'Chinese',
        topics: [
          {
            id: '37a0bd94-13c5-4e91-83cf-447fd68cf82a',
            name: 'President',
            materials: [
              {
                id: 'dc46b228-36cd-4000-85e4-5cdc5dd4b6da',
                name: 'Xi Jinping declares complete victory in eradicating poverty in China',
                link: 'https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwijhaue_IrvAhVDOBoKHQSgB3YQxfQBMAB6BAgFEAM&url=https%3A%2F%2Fwww.thehindu.com%2Fnews%2Finternational%2Fpresident-xi-jinping-declares-complete-victory-in-eradicating-poverty-in-china%2Farticle33930137.ece&usg=AOvVaw2uDS3fStwIBYkG6Zrq7pXJ',
                questions: [
                  {
                    id: '85f7e501-253d-41cb-a780-ad6c1f0fb008',
                    text: 'What cartoon animal does the president of China resemble?',
                    answers: [
                      {
                        text: 'Bear',
                        explanation: 'You know it\'s true.',
                        isCorrect: true
                      }, {
                        text: 'Crane',
                        explanation: 'What?',
                        isCorrect: false
                      }
                    ]
                  }
                ],
                score: 0
              }
            ],
            tasks: [],
            materialsScore: 0,
            tasksScore: 0,
            score: 0
          }
        ]
      }
    ];

    return {
      workspaces
    };
  }
}
