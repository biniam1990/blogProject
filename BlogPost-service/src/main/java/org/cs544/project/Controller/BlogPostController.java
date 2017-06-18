package org.cs544.project.Controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.cs544.project.domain.BlogPost;
import org.cs544.project.service.BlogPostService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogPostController {
	@Resource
	private BlogPostService postService;
	
	@RequestMapping(value="/posts", method=RequestMethod.GET)
	public List<BlogPost>getAllPosts(){
		
//		return Arrays.asList(new BlogPost("Book1", "loan", LocalDate.now(), LocalDate.now()),
//				new BlogPost("Book2", "loan", LocalDate.now(), LocalDate.now()));		
	return postService.getPosts();
	}
	@RequestMapping(value="/posts", method=RequestMethod.POST)
	public BlogPost addPost(@RequestBody BlogPost post){
		return postService.addPost(post);
	}
	
	@RequestMapping(value="/posts/{postId}", method= RequestMethod.GET)
	public BlogPost getPost(@PathVariable int postId){
//		return new BlogPost("loan", "returning", LocalDate.now(), LocalDate.now());
		return postService.getPost(postId);
	}
	
	@RequestMapping(value ="/posts/{postId}", method=RequestMethod.PUT)
	public BlogPost updatePost(@PathVariable int postId,BlogPost post){
		postService.updatePost(post,postId);
		return post;
	}
	
	@RequestMapping(value="/posts/{postId}", method=RequestMethod.DELETE)
	public void deletePost(int id){
		postService.deletePost(id);
	}

}
