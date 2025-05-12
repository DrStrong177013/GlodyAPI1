package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.CommentLike;
import java.util.List;
import java.util.Optional;

public interface CommentLikeService {
    List<CommentLike> findAll();
    Optional<CommentLike> findById(Integer id);
    CommentLike save(CommentLike entity);
    void deleteById(Integer id);
}