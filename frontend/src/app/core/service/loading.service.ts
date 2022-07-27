import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root',
})
export class LoadingService {

  public loading: any[] = [];

  constructor() {
  }

  start(): void {
    this.loading.push({});
  }

  stop(): void {
    this.loading.pop();
  }

}