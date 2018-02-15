package com.java.consumer.model;

import java.io.Serializable;
/**
 * 
 * @author Anil
 *
 */
public class UserDetails implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 603604702215438697L;

	private Long id; 
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
