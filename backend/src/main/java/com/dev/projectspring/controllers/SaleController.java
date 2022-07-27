package com.dev.projectspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.projectspring.dto.SaleDTO;
import com.dev.projectspring.dto.SaleSuccessDTO;
import com.dev.projectspring.dto.SaleSumDTO;
import com.dev.projectspring.entities.Sale;
import com.dev.projectspring.service.SaleService;

// TODO: Auto-generated Javadoc
/**
 * The Class SaleController.
 */
@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	/** The service. */
	@Autowired
	private SaleService service;

	/**
	 * Find all.
	 *
	 * @param pageable the pageable
	 * @return the response entity
	 */
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}

	/**
	 * Amount grouped by seller.
	 *
	 * @return the response entity
	 */
	@GetMapping(value = "amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		List<SaleSumDTO> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);
	}

	/**
	 * Sucess grouped by seller.
	 *
	 * @return the response entity
	 */
	@GetMapping(value = "sucess-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> sucessGroupedBySeller() {
		List<SaleSuccessDTO> list = service.sucessGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	
	
}

