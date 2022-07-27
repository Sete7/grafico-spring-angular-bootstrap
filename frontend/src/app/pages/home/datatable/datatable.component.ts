import { Page } from './../../../core/model/pageable';
import { SaleService } from './../../../core/service/sale.service';
import { Component, OnInit } from '@angular/core';
import { SaleDTO } from 'src/app/core/model/saleDTO';

@Component({
  selector: 'app-datatable',
  templateUrl: './datatable.component.html',
  styleUrls: ['./datatable.component.css']
})
export class DatatableComponent implements OnInit {

  public saleDTO: SaleDTO[];
  public sale?: SaleDTO;
  public page!: Page;

  pageNumber: number
  pageSize: number
  offset: number
  paged: boolean
  unpaged: boolean
  totalPages: number
  totalElements: number
  last: boolean
  first: boolean
  size: number
  number: number
  numberOfElements: number
  empty: boolean

  constructor(
    private saleService: SaleService
  ) { }

  ngOnInit(): void {
    this.findAll(0, 10);
  }

  findAll(page, size) {
    this.saleService.findAll(page, size).subscribe(
      resp => {
        this.page = resp;
        this.saleDTO = this.page.content;
      }
    )
  }

  changePge(event){
    this.findAll(event.page, event.size);
  }

}