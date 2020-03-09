package com.spring.codeblog2.repositoty;

import com.spring.codeblog2.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {
}
