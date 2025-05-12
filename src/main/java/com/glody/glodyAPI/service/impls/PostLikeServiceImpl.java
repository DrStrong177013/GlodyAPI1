package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.PostLike;
import com.glody.glodyAPI.repository.PostLikeRepository;
import com.glody.glodyAPI.service.PostLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostLikeServiceImpl implements PostLikeService {

    @Autowired
    private PostLikeRepository repository;

    @Override
    public List<PostLike> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<PostLike> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public PostLike save(PostLike entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}