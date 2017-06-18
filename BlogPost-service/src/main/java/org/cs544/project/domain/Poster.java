package org.cs544.project.domain;

import java.util.ArrayList;
import java.util.List;

public class Poster extends Commenter {
	
	private BlogPost post;
	
	List<BlogPost> posts= new ArrayList<>();
	
	public boolean addPost(BlogPost post){
		post.setPoster(this);
	    return  posts.add(post);
	}
	
	public boolean removePost(BlogPost post){
		post.setPoster(null);
		return posts.remove(post);
	}
	

	public BlogPost getPost() {
		return post;
	}

	public void setPost(BlogPost post) {
		this.post = post;
	}

	public List<BlogPost> getPosts() {
		return posts;
	}

	public void setPosts(List<BlogPost> posts) {
		this.posts = posts;
	}
	

}
