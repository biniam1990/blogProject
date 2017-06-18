package org.cs544.project.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Comment {
	
	private int id;
	private String content;
	private LocalDate created;
	private LocalDate updated;
	
	private Commenter commenter;
	

	public Comment() {}

	public Commenter getCommenter() {
		return commenter;
	}

	public void setCommenter(Commenter commenter) {
		this.commenter = commenter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	

}
