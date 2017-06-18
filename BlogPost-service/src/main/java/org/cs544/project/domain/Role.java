package org.cs544.project.domain;

import javax.persistence.*;

@Entity
public class Role {
	@Id
	@GeneratedValue
	private int id;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
