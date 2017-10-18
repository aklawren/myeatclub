package com.gearlaunch.myeatclub.model;

import java.util.Date;

/**
 */
public class User {

	public enum UserType {
		Standard, Corporate, StandardPremium, CorporatePremium
	}

	private Long id;

	private String name;

	private String email;

	private UserType userType;

	private Date created;

	private Date updated;

	public User(final Long id, final String name, final String email, final UserType userType, final Date created, final Date updated) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.userType = userType;
		this.created = created;
		this.updated = updated;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
}
