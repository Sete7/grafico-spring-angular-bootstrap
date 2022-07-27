import { SharedModule } from './../../shared/shared.module';
import { HomeComponent } from './home.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { routes } from './home.routes';
import { DatatableComponent } from './datatable/datatable.component';
import { GraficComponent } from './grafic/grafic.component';
import { NgApexchartsModule } from 'ng-apexcharts';

@NgModule({
  declarations: [
    HomeComponent,
    DatatableComponent,
    GraficComponent
  ],
  imports: [
    CommonModule,
    NgApexchartsModule,
    SharedModule,
    RouterModule.forChild(routes),
  ],
  exports: [
    DatatableComponent
  ]
})
export class HomeModule { }
