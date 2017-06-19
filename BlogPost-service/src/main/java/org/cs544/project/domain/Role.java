package org.cs544.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Role {

	@Id
	@GeneratedValue
	private int id;
	@OneToOne
	@JoinColumn
	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		user.setRole(this);
		this.user = user;
	}

}
