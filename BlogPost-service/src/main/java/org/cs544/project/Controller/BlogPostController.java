package org.cs544.project.Controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.cs544.project.domain.BlogPost;
import org.cs544.project.service.BlogPostService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogPostController {
	@Resource
	private BlogPostService postService;
	
	@GetMapping(value="/posts")
	public List<BlogPost>getAllPosts(){	
	return postService.getPosts();
	}
	@PostMapping(value="{userId}/posts")
	public BlogPost addPost(String title,String content, @PathVariable int userId){
		return postService.addPost(title,content,userId);
	}
	
	@GetMapping(value="/posts/{postId}")
	public BlogPost getPost(@PathVariable int postId){
		return postService.getPost(postId);
	}

	@PutMapping(value ="{userId}/posts/{postId}")
	public BlogPost updatePost(@PathVariable int postId,String title,String content){
		return postService.updatePost(title, content, postId);
	}
	
	@DeleteMapping(value="{userId}/posts/{postId}")
	public void deletePost(int id){
		postService.deletePost(id);
	}

}
