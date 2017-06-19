package org.cs544.project.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.cs544.project.domain.Comment;
import org.cs544.project.service.CommentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class CommentController {

	@Resource
	private CommentService commentService;

	@RequestMapping(value = "/{postId}/comments", method = RequestMethod.GET)

	public List<Comment> getComments(@PathVariable int postId) {

		return commentService.getComment(postId);

	}

	@RequestMapping(value = "/{postId}/comments/{commentId}", method = RequestMethod.GET)

	public Comment getOneComment(@PathVariable int postId, @PathVariable int commentId) {

		return getComments(postId).get(commentId);

	}

	@RequestMapping(value = "/{postId}/comments", method = RequestMethod.POST)
	public Comment addComment(@RequestBody Comment comment, @PathVariable int postId) {

		return commentService.addComment(comment, postId);
	}

	@RequestMapping(value = "/{postId}/comments/{commentId}/", method = RequestMethod.DELETE)
	public void deleteComment(@PathVariable int postId, @PathVariable int commentId) {
		Comment comment = getComments(postId).get(commentId);
		commentService.deleteComment(comment);
	}
	
	
//	@RequestMapping(value = "/{postId}/comments/{commentId}/", method = RequestMethod.PUT)
//	public void updateComment(@PathVariable int postId, @PathVariable int commentId) {
//		Comment comment = getComments(postId).get(commentId);
//		commentService.deleteComment(comment);
//	}
	
}
