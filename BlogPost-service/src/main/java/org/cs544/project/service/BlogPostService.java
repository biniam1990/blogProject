package org.cs544.project.service;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.Resource;

import org.cs544.project.Repository.BlogPostRepository;
import org.cs544.project.Repository.UserRepository;
import org.cs544.project.domain.BlogPost;
import org.cs544.project.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
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
	public BlogPost addPost(String title,String content, int userId){
        User user= (User)userRepository.findUserById(userId);
        BlogPost post = new BlogPost(title, content, LocalDate.now(), user);
        post.setUser(user);
		postRepository.save(post);
		return post;
	}
	
	//updates post
	public BlogPost updatePost(String title,String content, int postId){
		BlogPost post = (BlogPost)postRepository.findBlogPostById(postId);
		post.setContent(content);
		post.setTitle(title);
		post.setUpdated(LocalDate.now());
		postRepository.save(post);
		return post;
	}
	
	//deletes post
	public void deletePost(int id){
		postRepository.delete(id);
	}
	
}
