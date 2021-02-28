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
                    name: 'Which of those isn\'t of the big four',
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
                    name: 'What does the rule of four and a half state.',
                    answers: [
                      {
                        text: 'That if you implement one of the of the big four functions, move constructor or a swap operator, you need to override the rest, as well',
                        explanation: 'Or they might not work correctly (assigment operator sometimes calls copy constructor as an optimization, for example).',
                        isCorrect: true
                      },
                      {
                        text: 'Alpaca',
                        explanation: 'This should have been the right answer.',
                        isCorrect: false
                      },
                      {
                        text: 'Destructor',
                        explanation: 'This is from a different question.',
                        isCorrect: false
                      }
                    ]
                  }
                ],
                score: 0
              }
            ],
            tasks: [],
            score: 50
          },
          {
            id: 'b6ec13fb-3c6d-41e7-828c-f8e752154330',
            name: 'Virtual functions',
            materials: [],
            tasks: [],
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
                name: 'Xi Jinping declares complete vicotry in eradicating poverty in China',
                link: 'https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwijhaue_IrvAhVDOBoKHQSgB3YQxfQBMAB6BAgFEAM&url=https%3A%2F%2Fwww.thehindu.com%2Fnews%2Finternational%2Fpresident-xi-jinping-declares-complete-victory-in-eradicating-poverty-in-china%2Farticle33930137.ece&usg=AOvVaw2uDS3fStwIBYkG6Zrq7pXJ',
                questions: [
                  {
                    id: '85f7e501-253d-41cb-a780-ad6c1f0fb008',
                    name: 'What cartoon animal does the president of China resemble?',
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
