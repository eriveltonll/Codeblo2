package com.spring.codeblog2.service;

import com.spring.codeblog2.model.Post;


import java.util.List;

public interface CodeblogService {


    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
