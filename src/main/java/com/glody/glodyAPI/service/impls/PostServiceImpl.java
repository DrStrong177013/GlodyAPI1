package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.Post;
import com.glody.glodyAPI.repository.PostRepository;
import com.glody.glodyAPI.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository repository;

    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Post> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Post save(Post entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}