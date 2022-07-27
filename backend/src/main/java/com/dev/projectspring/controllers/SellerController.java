package com.dev.projectspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.projectspring.dto.SellerDTO;
import com.dev.projectspring.entities.Seller;
import com.dev.projectspring.service.SellerService;

// TODO: Auto-generated Javadoc
/**
 * The Class SellerController.
 */
@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

	/** The seller service. */
	@Autowired
	private SellerService sellerService;

	/**
	 * Find all.
	 *
	 * @return the response entity
	 */
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll() {
		List<SellerDTO> list = sellerService.fildAll();
		return ResponseEntity.ok(list);
	}
	
}
