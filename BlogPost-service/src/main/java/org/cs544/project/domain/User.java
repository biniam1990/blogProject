package org.cs544.project.domain;

<<<<<<< HEAD

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

=======
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
>>>>>>> f9a3132ae00df97f6e9d52d0995a69deaf3a0131
@Entity
public class User {
	@Id 
	@GeneratedValue
	private int id;
<<<<<<< HEAD
=======
 
>>>>>>> f9a3132ae00df97f6e9d52d0995a69deaf3a0131
	private String name;
	private String username;
	private String password;
	private Role role;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	

}
