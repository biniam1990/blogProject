package org.cs544.project.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;   

@Entity
public class Poster extends Commenter {
	
	@OneToMany(mappedBy="poster")
	List<BlogPost> posts= new ArrayList<>();
	
	public boolean addPost(BlogPost post){
		post.setPoster(this);
	    return  posts.add(post);
	}
	
	public boolean removePost(BlogPost post){
		post.setPoster(null);
		return posts.remove(post);
	}

	public List<BlogPost> getPosts() {
		return posts;
	}

	public void setPosts(List<BlogPost> posts) {
		this.posts = posts;
	}
	

}
