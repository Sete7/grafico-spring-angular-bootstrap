package com.dev.projectspring.dto;

import java.io.Serializable;

import com.dev.projectspring.entities.Seller;

// TODO: Auto-generated Javadoc
/**
 * The Class SaleSuccessDTO.
 */
public class SaleSuccessDTO implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The seller name. */
	private String sellerName;
	
	/** The visited. */
	private Long visited;
	
	/** The deals. */
	private Long deals;
	
	/**
	 * Instantiates a new sale success DTO.
	 */
	public SaleSuccessDTO() {
		
	}

	/**
	 * Instantiates a new sale success DTO.
	 *
	 * @param seller the seller
	 * @param visited the visited
	 * @param deals the deals
	 */
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	/**
	 * Gets the seller name.
	 *
	 * @return the seller name
	 */
	public String getSellerName() {
		return sellerName;
	}

	/**
	 * Sets the seller name.
	 *
	 * @param sellerName the new seller name
	 */
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	/**
	 * Gets the visited.
	 *
	 * @return the visited
	 */
	public Long getVisited() {
		return visited;
	}

	/**
	 * Sets the visited.
	 *
	 * @param visited the new visited
	 */
	public void setVisited(Long visited) {
		this.visited = visited;
	}

	/**
	 * Gets the deals.
	 *
	 * @return the deals
	 */
	public Long getDeals() {
		return deals;
	}

	/**
	 * Sets the deals.
	 *
	 * @param deals the new deals
	 */
	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
	
}
