package org.cs544.project.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class BlogPost {
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String content;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate created;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate updated;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="post_id")
	private List<Comment> comments= new ArrayList<>();
    @ManyToOne
	private User user;

	public BlogPost() {	}

	public BlogPost(String title, String content, LocalDate created,User user) {
		this.title = title;
		this.content = content;
		this.created = created;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public LocalDate getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDate updated) {
		this.updated = updated;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	public boolean addComment(Comment comment){
		return comments.add(comment);
	}
	
	public boolean removeComment(Comment comment){
		return comments.remove(comment);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
