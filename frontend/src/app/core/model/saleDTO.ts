import { SellerDTO } from './sellerDTO';

export class SaleDTO {

    constructor(
        public id?: number,
        public visited?: number,
        public deals?: number,
        public amount?: number,
        public date?: string,
        public seller?: SellerDTO
    ) { }

}