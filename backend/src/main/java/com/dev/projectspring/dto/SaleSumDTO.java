package com.dev.projectspring.dto;

import java.io.Serializable;

import com.dev.projectspring.entities.Seller;

// TODO: Auto-generated Javadoc
/**
 * The Class SaleSumDTO.
 */
public class SaleSumDTO implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The seller name. */
	private String sellerName;
	
	/** The sum. */
	private Double sum;

	/**
	 * Instantiates a new sale sum DTO.
	 */
	public SaleSumDTO() {

	}

	/**
	 * Instantiates a new sale sum DTO.
	 *
	 * @param seller the seller
	 * @param sum the sum
	 */
	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
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
	 * Gets the sum.
	 *
	 * @return the sum
	 */
	public Double getSum() {
		return sum;
	}

	/**
	 * Sets the sum.
	 *
	 * @param sum the new sum
	 */
	public void setSum(Double sum) {
		this.sum = sum;
	}

}
