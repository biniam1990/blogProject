package org.cs544.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {
<<<<<<< HEAD
	@Id
	@GeneratedValue
	private int id;
=======
 
	@Id
	@GeneratedValue
	private int id;
	
 
>>>>>>> f9a3132ae00df97f6e9d52d0995a69deaf3a0131
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
