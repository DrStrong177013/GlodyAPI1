package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Post;
import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Post> findAll();
    Optional<Post> findById(Integer id);
    Post save(Post entity);
    void deleteById(Integer id);
}