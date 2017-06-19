package org.cs544.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.cs544.project.Repository.BlogPostRepository;
import org.cs544.project.Repository.CommentRepository;
import org.cs544.project.Repository.UserRepository;
import org.cs544.project.domain.BlogPost;
import org.cs544.project.domain.Comment;
import org.cs544.project.domain.Commenter;
import org.cs544.project.domain.Role;
import org.cs544.project.domain.User;

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
		return commentRepository.findComment(id);
	}

	// update Comment

	public Comment updateComment(Comment comment) {
//		Commenter commenter = new Commenter();
//		commenter.setUser(user);
//		comment.setCommenter(commenter);;
		commentRepository.save(comment);
		return comment;
	}

	// deletes post

	public void deleteComment(int id) {

		commentRepository.delete(id);
	}

	public Comment addComment(Comment comment, int postId, int id) {
		BlogPost tempPost = blogPostRepository.findBlogPostById(postId);
		User user = userRepository.findUserById(id);
		Commenter commenter = new Commenter();
		commenter.setUser(user);
		comment.setCommenter(commenter);

		tempPost.addComment(comment);

		blogPostRepository.save(tempPost);
		return comment;

	}

}
