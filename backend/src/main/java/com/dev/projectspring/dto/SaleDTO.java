package com.dev.projectspring.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.dev.projectspring.entities.Sale;
import com.dev.projectspring.entities.Seller;

// TODO: Auto-generated Javadoc
/**
 * The Class SaleDTO.
 */
public class SaleDTO implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Long id;
	
	/** The visited. */
	private Integer visited;
	
	/** The deals. */
	private Integer deals;
	
	/** The amount. */
	private Double amount;
	
	/** The date. */
	private LocalDate date;

	/** The seller. */
	private SellerDTO seller;

	/**
	 * Instantiates a new sale DTO.
	 */
	public SaleDTO() {

	}

	/**
	 * Instantiates a new sale DTO.
	 *
	 * @param id the id
	 * @param visited the visited
	 * @param deals the deals
	 * @param amount the amount
	 * @param date the date
	 * @param seller the seller
	 */
	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	/**
	 * Instantiates a new sale DTO.
	 *
	 * @param entity the entity
	 */
	public SaleDTO(Sale entity) {
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller = new SellerDTO(entity.getSeller());
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the visited.
	 *
	 * @return the visited
	 */
	public Integer getVisited() {
		return visited;
	}

	/**
	 * Sets the visited.
	 *
	 * @param visited the new visited
	 */
	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	/**
	 * Gets the deals.
	 *
	 * @return the deals
	 */
	public Integer getDeals() {
		return deals;
	}

	/**
	 * Sets the deals.
	 *
	 * @param deals the new deals
	 */
	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Gets the seller.
	 *
	 * @return the seller
	 */
	public SellerDTO getSeller() {
		return seller;
	}

	/**
	 * Sets the seller.
	 *
	 * @param seller the new seller
	 */
	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}

}
