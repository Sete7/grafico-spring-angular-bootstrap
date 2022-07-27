package com.dev.projectspring.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Seller.
 */
@Entity
@Table(name = "tb_sellers")
public class Seller {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** The name. */
	private String name;
	
	/** The sale. */
	@OneToMany(mappedBy = "seller")
	private List<Sale> sale = new ArrayList<>();

	/**
	 * Instantiates a new seller.
	 */
	public Seller() {

	}

	/**
	 * Instantiates a new seller.
	 *
	 * @param id the id
	 * @param name the name
	 */
	public Seller(Long id, String name) {
		this.id = id;
		this.name = name;
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
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the sales.
	 *
	 * @return the sales
	 */
	public List<Sale> getSales() {
		return sale;
	}

}
