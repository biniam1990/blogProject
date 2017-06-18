package org.cs544.project.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Commenter extends Role{

	@ManyToOne(mappedBy="commenter")
	private List<Comment> comments= new ArrayList<>();
	
	public Commenter() {}

	public boolean addComments(Comment comment){
		comment.setCommenter(this);
		return comments.add(comment);
	}
	
	public boolean removeComments(Comment comment){
		comment.setCommenter(null);
		return comments.add(comment);
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
}
