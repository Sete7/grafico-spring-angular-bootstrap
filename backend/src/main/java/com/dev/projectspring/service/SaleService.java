package com.dev.projectspring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.projectspring.dto.SaleDTO;
import com.dev.projectspring.dto.SaleSuccessDTO;
import com.dev.projectspring.dto.SaleSumDTO;
import com.dev.projectspring.entities.Sale;
import com.dev.projectspring.repository.SaleRepository;
import com.dev.projectspring.repository.SellerRopository;

// TODO: Auto-generated Javadoc
/**
 * The Class SaleService.
 */
@Service
public class SaleService {

	/** The repository. */
	@Autowired
	private SaleRepository repository;

	/** The seller ropository. */
	@Autowired
	private SellerRopository sellerRopository;

	/**
	 * Find all.
	 *
	 * @param pageable the pageable
	 * @return the page
	 */
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRopository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}

	/**
	 * Amount grouped by seller.
	 *
	 * @return the list
	 */
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}

	/**
	 * Sucess grouped by seller.
	 *
	 * @return the list
	 */
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> sucessGroupedBySeller() {
		return repository.sucessGroupedBySeller();
	}

}
