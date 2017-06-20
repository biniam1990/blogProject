package org.cs544.project.service;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.Resource;

import org.cs544.project.Repository.BlogPostRepository;
import org.cs544.project.Repository.CommentRepository;
import org.cs544.project.Repository.UserRepository;
import org.cs544.project.domain.BlogPost;
import org.cs544.project.domain.Comment;
import org.cs544.project.domain.User;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

	@Resource
	private CommentRepository commentRepository;

	@Resource
	private BlogPostRepository blogPostRepository;

	@Resource
	private UserRepository userRepository;

	// gets all commments
	public List<Comment> getComments() {
		return commentRepository.findAll();
	}

	// get comment by id
	public List<Comment> getComment(int id) {
		return commentRepository.findCommentById(id);
	}
	
	//add comment
	public Comment addComment(String content, int postId, int userId) {
		BlogPost tempPost = blogPostRepository.findBlogPostById(postId);
		User user = userRepository.findUserById(userId);
		Comment comment= new Comment(content, LocalDate.now(), user);
		tempPost.addComment(comment);
		blogPostRepository.save(tempPost);
		return comment;
	}

	// update Comment

	public Comment updateComment(String content, int commentId) {
        Comment comment = (Comment)commentRepository.findCommentById(commentId);
        comment.setUpdated(LocalDate.now());
		commentRepository.save(comment);
		return comment;
	}

	// deletes post

	public void deleteComment(int id) {
		commentRepository.delete(id);
	}

	

}
