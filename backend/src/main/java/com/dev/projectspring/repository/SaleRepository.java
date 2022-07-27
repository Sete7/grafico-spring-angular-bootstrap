package com.dev.projectspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.projectspring.dto.SaleSuccessDTO;
import com.dev.projectspring.dto.SaleSumDTO;
import com.dev.projectspring.entities.Sale;

// TODO: Auto-generated Javadoc
/**
 * The Interface SaleRepository.
 */
public interface SaleRepository extends JpaRepository<Sale, Long>{

	/**
	 * Amount grouped by seller.
	 *
	 * @return the list
	 */
	@Query("SELECT new com.dev.projectspring.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale AS obj"
			+ " GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	/**
	 * Sucess grouped by seller.
	 *
	 * @return the list
	 */
	@Query("SELECT new com.dev.projectspring.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM"
			+ " Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> sucessGroupedBySeller();
}
