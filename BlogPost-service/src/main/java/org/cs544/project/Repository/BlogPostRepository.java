package org.cs544.project.Repository;

import org.cs544.project.domain.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost,Integer> {
	BlogPost findBlogPostById(int id);
}
