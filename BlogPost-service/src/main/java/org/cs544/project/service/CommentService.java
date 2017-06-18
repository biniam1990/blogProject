package org.cs544.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.cs544.project.Repository.BlogPostRepository;
import org.cs544.project.Repository.CommentRepository;
import org.cs544.project.domain.BlogPost;
import org.cs544.project.domain.Comment;

public class CommentService {

	@Resource
	private CommentRepository commentRepository;
	
	@Resource
	private BlogPostRepository blogPostRepository;
	
	//gets all commments 
	public List<Comment> getComments(){
		return commentRepository.findAll();
	}
	
	//get comment by id 
	public List<Comment> getComment(int id){
		return commentRepository.findComment(id);
	}
	
 //update Comment 
	
	public Comment  updateComment(Comment comment, int id){
		commentRepository.save(comment);
		return comment;
	}
	
	//deletes post
	
	public void deleteComment(Comment comment){
		commentRepository.delete(comment);
	}
	
	public Comment addComment(Comment comment, int postId){
		BlogPost tempPost= blogPostRepository.findBlogPostById(postId);
	return tempPost.se
		
		
	}
	
	
}
