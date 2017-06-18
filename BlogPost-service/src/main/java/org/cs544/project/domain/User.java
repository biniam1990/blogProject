package org.cs544.project.domain;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	int id;
=======
import javax.persistence.*;
 
@Entity
public class User {
	@Id 
	@GeneratedValue
	private int id;
>>>>>>> 5e163baff5929387303470ea68686ddbcc952d43
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
