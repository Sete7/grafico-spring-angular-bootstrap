package com.dev.projectspring.dto;

import java.io.Serializable;

import com.dev.projectspring.entities.Seller;

// TODO: Auto-generated Javadoc
/**
 * The Class SellerDTO.
 */
public class SellerDTO implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Long id;
	
	/** The name. */
	private String name;

	/**
	 * Instantiates a new seller DTO.
	 */
	public SellerDTO() {

	}

	/**
	 * Instantiates a new seller DTO.
	 *
	 * @param id the id
	 * @param name the name
	 */
	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Instantiates a new seller DTO.
	 *
	 * @param entity the entity
	 */
	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getName();
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

}
