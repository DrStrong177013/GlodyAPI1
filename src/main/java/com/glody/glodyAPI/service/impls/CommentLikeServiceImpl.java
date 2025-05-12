package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.CommentLike;
import com.glody.glodyAPI.repository.CommentLikeRepository;
import com.glody.glodyAPI.service.CommentLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentLikeServiceImpl implements CommentLikeService {

    @Autowired
    private CommentLikeRepository repository;

    @Override
    public List<CommentLike> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<CommentLike> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public CommentLike save(CommentLike entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}