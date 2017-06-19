package org.cs544.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.cs544.project.Repository.BlogPostRepository;
import org.cs544.project.Repository.UserRepository;
import org.cs544.project.domain.BlogPost;
import org.cs544.project.domain.Poster;
import org.cs544.project.domain.User;
import org.springframework.stereotype.Service;

@Service
public class BlogPostService {
	
	@Resource
	private BlogPostRepository postRepository;
	
	@Resource
	private UserRepository userRepository;
	
	//gets all posts
	public List<BlogPost> getPosts(){
		return postRepository.findAll();
	}
	
	//gets one post by id
	public BlogPost getPost(int id){
		return postRepository.findBlogPostById(id);
	}
	
	//adds the post
	public BlogPost addPost(BlogPost post, int userId){
        User user= userRepository.findUserById(userId);
        Poster poster = new Poster();
        poster.setUser(user);
        post.setPoster(poster);
		postRepository.save(post);
		return post;
	}
	
	//updates post
	public BlogPost updatePost(BlogPost post, int id, int userId){
		postRepository.save(post);
		return post;
	}
	
	//deletes post
	public void deletePost(int id){
		postRepository.delete(id);
	}
	
}
