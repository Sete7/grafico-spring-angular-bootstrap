import { HttpClient, HttpErrorResponse, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, timeout } from 'rxjs/operators';
import { LoadingService } from './loading.service';
// import { MatSnackBar } from '@angular/material/snack-bar';

const DEFAULT_TIMEOUT = 180000;

@Injectable({
    providedIn: 'root',
})
export class ApiGateway {


    constructor(
        private http: HttpClient,
        private loadingService: LoadingService,
        // private snackBar: MatSnackBar
        ) {

    }

    /**
     * GET autenticado. Erros são tratados em handleError (https://angular.io/guide/http#getting-error-details)
     * @param url url
     * @param options enviado ao HttpClient
     * @param timeoutMs timeout em ms
     * @param showLoading para apresentar um loading enquanto carrega, default true (false para controlar display do loading no caller)
     */
    get<T>(url: string, options?: {
        headers?: HttpHeaders | {
            [header: string]: string | string[];
        };
        observe?: any;
        params?: HttpParams | {
            [param: string]: string | string[];
        };
        reportProgress?: boolean;
        responseType?: any;
    },
           timeoutMs?: number, showLoading: boolean = true): Observable<T> {

        // if (showLoading === undefined || showLoading === null) {
        //     showLoading = true;
        // }

        return new Observable<T>(observer => {
            if (showLoading) {
                this.loadingService.start();
            }
            this.http.get<T>(url, options)
                .pipe(timeout(timeoutMs || DEFAULT_TIMEOUT)) // timeout
                .pipe(catchError(this.handleError)) // error handling
                .subscribe(ret => {
                    if (showLoading) {
                        this.loadingService.stop();
                    }
                    observer.next(ret as T);
                    observer.complete();
                }, error => {
                    if (showLoading) {
                        this.loadingService.stop();
                    }

                    if (error && error.name === 'TimeoutError') {
                        // this.alertService.danger('Tempo limite esgotado. Favor tentar novamente');
                        // this.snackBar.open('Tempo limite esgotado, Favor tentar novamente', 'x' , {
                        //     duration: 5000,
                        //     horizontalPosition: 'right',
                        //     verticalPosition: 'top',
                        //     panelClass: ['msg-error']
                        //   });
                    } else {
                        // this.alertService.danger('Ocorreu um erro ao acessar. Favor tentar novamente');
                        // this.snackBar.open(error.error, 'x' , {
                        //     duration: 5000,
                        //     horizontalPosition: 'right',
                        //     verticalPosition: 'top',
                        //     panelClass: ['msg-error']
                        //   });
                    }
                });
        });
    }


    /**
     * POST autenticado. Erros são tratados em handleError (https://angular.io/guide/http#getting-error-details)
     * @param url url
     * @param obj obj
     * @param options options enviado para o HttpClient
     * @param timeoutMs timeout em ms
     * @param showLoading para apresentar um loading enquanto carrega, default true (false para controlar display do loading no caller)
     */
    post<T>(url: string, obj: any, options?: {
        headers?: HttpHeaders | {
            [header: string]: string | string[];
        };
        observe?: any;
        params?: HttpParams | {
            [param: string]: string | string[];
        };
        reportProgress?: boolean;
        responseType?: any;
    },
            timeoutMs?: number, showLoading: boolean = true): Observable<T> {

        // if (showLoading === undefined || showLoading === null) {
        //     showLoading = true;
        // }

        return new Observable<T>(observer => {
            if (showLoading) {
                this.loadingService.start();
            }
            this.http.post<T>(url, obj, options)
                .pipe(timeout(timeoutMs || DEFAULT_TIMEOUT)) // timeout
                .pipe(catchError(this.handleError)) // error handling
                .subscribe(ret => {
                    if (showLoading) {
                        this.loadingService.stop();
                    }
                    observer.next(ret as T);
                    observer.complete();
                }, error => {
                    if (showLoading) {
                        this.loadingService.stop();
                    }

                    if (error && error.name === 'TimeoutError') {
                        // this.alertService.danger('Tempo limite esgotado. Favor tentar novamente');
                        // this.snackBar.open('Tempo limite esgotado, Favor tentar novamente', 'x' , {
                        //     duration: 5000,
                        //     horizontalPosition: 'right',
                        //     verticalPosition: 'top',
                        //     panelClass: ['msg-error']
                        //   });
                    } else {
                        // this.alertService.danger('Ocorreu um erro ao acessar. Favor tentar novamente');
                        // this.snackBar.open(error.error, 'x' , {
                        //     duration: 5000,
                        //     horizontalPosition: 'right',
                        //     verticalPosition: 'top',
                        //     panelClass: ['msg-error']
                        //   });
                    }
                });
        });
    }

    /**
     * PUT autenticado. Erros são tratados em handleError (https://angular.io/guide/http#getting-error-details)
     * @param url url
     * @param obj obj
     * @param options options enviado para o HttpClient
     * @param timeoutMs timeout em ms
     * @param showLoading para apresentar um loading enquanto carrega, default true (false para controlar display do loading no caller)
     */
    put<T>(url: string, obj: any, options?: {
        headers?: HttpHeaders | {
            [header: string]: string | string[];
        };
        observe?: 'body';
        params?: HttpParams | {
            [param: string]: string | string[];
        };
        reportProgress?: boolean;
        responseType?: 'json';
    },
           timeoutMs?: number, showLoading: boolean = true): Observable<T> {

        // if (showLoading === undefined || showLoading === null) {
        //     showLoading = true;
        // }

        return new Observable<T>(observer => {
            if (showLoading) {
                this.loadingService.start();
            }
            this.http.put<T>(url, obj, options)
                .pipe(timeout(timeoutMs || DEFAULT_TIMEOUT)) // timeout
                .pipe(catchError(this.handleError)) // error handling
                .subscribe(ret => {
                    if (showLoading) {
                        this.loadingService.stop();
                    }
                    observer.next(ret as T);
                    observer.complete();
                }, error => {
                    if (showLoading) {
                        this.loadingService.stop();
                    }

                    if (error && error.name === 'TimeoutError') {
                        // this.alertService.danger('Tempo limite esgotado. Favor tentar novamente');
                        // this.snackBar.open('Tempo limite esgotado, Favor tentar novamente', 'x' , {
                        //     duration: 5000,
                        //     horizontalPosition: 'right',
                        //     verticalPosition: 'top',
                        //     panelClass: ['msg-error']
                        //   });

                    } else {
                        // this.alertService.danger('Ocorreu um erro ao acessar. Favor tentar novamente');
                        // this.snackBar.open(error.error, 'x' , {
                        //     duration: 5000,
                        //     horizontalPosition: 'right',
                        //     verticalPosition: 'top',
                        //     panelClass: ['msg-error']
                        //   });
                    }
                });
        });
    }

    /**
     * DELETE autenticado. Erros são tratados em handleError (https://angular.io/guide/http#getting-error-details)
     * @param url url
     * @param options options enviado para o HttpClient
     * @param timeoutMs timeout em ms
     * @param showLoading para apresentar um loading enquanto carrega, default true (false para controlar display do loading no caller)
     */
    delete<T>(url: string, options?: {
        headers?: HttpHeaders | {
            [header: string]: string | string[];
        };
        observe?: 'body';
        params?: HttpParams | {
            [param: string]: string | string[];
        };
        reportProgress?: boolean;
        responseType?: 'json';
    },
              timeoutMs?: number, showLoading: boolean = true): Observable<T> {

        // if (showLoading === undefined || showLoading === null) {
        //     showLoading = true;
        // }

        return new Observable<T>(observer => {
            if (showLoading) {
                this.loadingService.start();
            }
            this.http.delete<T>(url, options)
                .pipe(timeout(timeoutMs || DEFAULT_TIMEOUT)) // timeout
                .pipe(catchError(this.handleError)) // error handling
                .subscribe(ret => {
                    if (showLoading) {
                        this.loadingService.stop();
                    }
                    observer.next(ret as T);
                    observer.complete();
                }, error => {
                    if (showLoading) {
                        this.loadingService.stop();
                    }

                    if (error && error.name === 'TimeoutError') {
                        // this.snackBar.open('Tempo limite esgotado, Favor tentar novamente', 'x' , {
                        //     duration: 5000,
                        //     horizontalPosition: 'right',
                        //     verticalPosition: 'top',
                        //     panelClass: ['msg-error']
                        //   });
                    } else {
                        // this.snackBar.open(error.error, 'x' , {
                        //     duration: 5000,
                        //     horizontalPosition: 'right',
                        //     verticalPosition: 'top',
                        //     panelClass: ['msg-error']
                        //   });
                    }
                });
        });
    }


    // tslint:disable-next-line:typedef
    private handleError(error: HttpErrorResponse) {
        if (error.error instanceof ErrorEvent) {
            // A client-side or network error occurred. Handle it accordingly.
            console.error('An error occurred:', error.error.message);
        } else {
            // The backend returned an unsuccessful response code.
            // The response body may contain clues as to what went wrong,
            console.error(
                `Backend returned code ${error.status}, ` +
                `body was: ${error.error}`);
        }
        // return an observable with a user-facing error message
        return throwError(error);
    }

}