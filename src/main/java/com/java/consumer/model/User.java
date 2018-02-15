package com.java.consumer.model;

import java.io.Serializable;

/**
 * 
 * @author Anil
 *
 */
public class User implements Serializable {

	/**
	 * /u90assd?useSSL=false
	 */
	private static final long serialVersionUID = -513698847128165676L;

	private Integer id;

	private String firstname;

	private String lastname;

	private String emailAddress;

	private String role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
