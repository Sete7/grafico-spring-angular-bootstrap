import { SaleSumDTO } from '../../../core/model/saleSumDTO.model';
import { SaleService } from './../../../core/service/sale.service';
import { Component, OnInit, ViewChild } from '@angular/core';
import {
  ApexNonAxisChartSeries, ApexResponsive, ApexAxisChartSeries, ApexChart,
  ChartComponent, ApexDataLabels, ApexXAxis, ApexPlotOptions
} from "ng-apexcharts";
import { round } from './../../../shared/utils/formatVisitedDeals';


export type TaxadeSucesso = {
  series: ApexAxisChartSeries;
  chart?: ApexChart;
  dataLabels: ApexDataLabels;
  options: ApexPlotOptions;
  xaxis: ApexXAxis;
};

export type GroupedBySeller = {
  sum: ApexNonAxisChartSeries;
  chart: ApexChart;
  responsive: ApexResponsive[];
  name: any;
};

@Component({
  selector: 'app-grafic',
  templateUrl: './grafic.component.html',
  styleUrls: ['./grafic.component.css']
})
export class GraficComponent implements OnInit {

  @ViewChild("chart") chart: ChartComponent;
  public taxadeSucesso: Partial<TaxadeSucesso>;
  public groupedBySeller: Partial<GroupedBySeller>;

  sale: SaleSumDTO[] = [];

  constructor(
    private saleService: SaleService
  ) { }

  ngOnInit(): void {
    this.amountGroupedBySeller();
    this.sucessGroupedBySeller();
  }

  sucessGroupedBySeller() {
    this.saleService.sucessGroupedBySeller().subscribe(
      resp => {
        let sellerName = resp.map(success => success.sellerName)
        let visited = resp.map(success => success.visited)
        let deals = resp.map(success => success.deals)
        let mySeries = resp.map(success => round(100 * success.deals / success.visited, 1));

        this.taxadeSucesso = {
          series: [
            {
              name: "% Success",
              data: mySeries
            }
          ],
          chart: {
            type: "bar",
            height: 350
          },
          options: {
            bar: {
              horizontal: true
            }
          },
          dataLabels: {
            enabled: false
          },
          xaxis: {
            categories: sellerName
          }
        };
      }
    )
  }

  amountGroupedBySeller() {
    this.saleService.amountBySeller().subscribe(
      resp => {
        let sellerName = resp.map(seller => seller.sellerName)
        let sum = resp.map(seller => seller.sum)

        this.groupedBySeller = {
          sum: sum,
          chart: {
            type: "donut"
          },
          name: sellerName,
          responsive: []
        };
      }
    )
  }




}
