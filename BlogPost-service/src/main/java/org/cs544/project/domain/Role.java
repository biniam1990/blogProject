package org.cs544.project.domain;

import javax.persistence.*;

@Entity
public class Role {
<<<<<<< HEAD
	int id;
=======
	@Id
	@GeneratedValue
	private int id;
	
>>>>>>> 5e163baff5929387303470ea68686ddbcc952d43
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
