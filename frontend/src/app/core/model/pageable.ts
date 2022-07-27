import { SaleDTO } from './saleDTO';
import { SellerDTO } from './sellerDTO';

export interface Page {
    content: Array<SaleDTO>;
    pageable: Pageable;
    totalPages: number;
    totalElements: number;
    last: boolean;
    first: boolean;
    sort?: any;
    size: number;
    number: number;
    numberOfElements: number;
    empty: boolean;
  }


  export interface Sale {
    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: string;
    seller: SellerDTO;
  }


  export interface Pageable {
    sort?: any;
    pageNumber: number
    pageSize: number
    offset: number
    paged: boolean
    unpaged: boolean
  }