package org.cs544.project.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BlogPost {
	
	private int id;
	private String title;
	private String content;
	private LocalDate created;
	private LocalDate updated;
	
	private List<Comment> comments= new ArrayList<>();
	
	
	

	public BlogPost(String title, String content, LocalDate created, LocalDate updated) {
		this.title = title;
		this.content = content;
		this.created = created;
		this.updated = updated;
	}

	public BlogPost() {	}

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
	
	

}
