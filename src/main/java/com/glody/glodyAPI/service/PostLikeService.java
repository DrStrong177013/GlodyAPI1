package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.PostLike;
import java.util.List;
import java.util.Optional;

public interface PostLikeService {
    List<PostLike> findAll();
    Optional<PostLike> findById(Integer id);
    PostLike save(PostLike entity);
    void deleteById(Integer id);
}