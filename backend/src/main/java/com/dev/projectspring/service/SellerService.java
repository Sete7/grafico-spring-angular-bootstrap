package com.dev.projectspring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.projectspring.dto.SellerDTO;
import com.dev.projectspring.entities.Seller;
import com.dev.projectspring.repository.SellerRopository;

// TODO: Auto-generated Javadoc
/**
 * The Class SellerService.
 */
@Service
public class SellerService {

	/** The repository. */
	@Autowired
	private SellerRopository repository;

	/**
	 * Fild all.
	 *
	 * @return the list
	 */
	public List<SellerDTO> fildAll(){
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
