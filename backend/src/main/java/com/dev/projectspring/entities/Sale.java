package com.dev.projectspring.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



// TODO: Auto-generated Javadoc
/**
 * The Class Sale.
 */
@Entity
@Table(name="tb_sales")
public class Sale {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;

	/**
	 * Instantiates a new sale.
	 */
	public Sale() {
		
	}

	/**
	 * Instantiates a new sale.
	 *
	 * @param id the id
	 * @param visited the visited
	 * @param deals the deals
	 * @param amount the amount
	 * @param date the date
	 */
	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
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
	public Seller getSeller() {
		return seller;
	}

	/**
	 * Sets the seller.
	 *
	 * @param seller the new seller
	 */
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
}
