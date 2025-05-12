package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Comment;
import java.util.List;
import java.util.Optional;

public interface CommentService {
    List<Comment> findAll();
    Optional<Comment> findById(Integer id);
    Comment save(Comment entity);
    void deleteById(Integer id);
}