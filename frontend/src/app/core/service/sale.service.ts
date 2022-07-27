import { Page } from './../model/pageable';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, EMPTY } from 'rxjs';
import { SaleSuccessDTO } from './../model/saleSuccessDTO';
import { SaleSumDTO } from '../model/saleSumDTO.model';
import { map, catchError } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { ApiGateway } from './api.gateway.service';

@Injectable({
  providedIn: 'root'
})
export class SaleService {

  baseUrl = `${environment.API}sales`;

  constructor(
    private http: HttpClient,
    private __apiGateway: ApiGateway
  ) { }

  errorHandler(e: any): Observable<any> {
    console.log("Ocorreu um error", e);
    return EMPTY;
  }

  amountBySeller(): Observable<SaleSumDTO[]> {
    return this.__apiGateway.get<SaleSumDTO[]>(`${this.baseUrl}/amount-by-seller`).pipe(
      map((obj) => obj),
      catchError(e => this.errorHandler(e))
    );
  }

  sucessGroupedBySeller(): Observable<SaleSuccessDTO[]> {
    return this.__apiGateway.get<SaleSuccessDTO[]>(`${this.baseUrl}/sucess-by-seller`).pipe(
      map((obj) => obj),
      catchError(e => this.errorHandler(e))
    );
  }

  findAll(page, size): Observable<Page> {
    return this.__apiGateway.get<Page>(`${this.baseUrl}?page=${page}&size=${size}`)
  }

}
