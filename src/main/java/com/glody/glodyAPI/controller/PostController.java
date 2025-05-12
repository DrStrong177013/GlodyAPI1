package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Post;
import com.glody.glodyAPI.model.dto.PostDto;
import com.glody.glodyAPI.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public ResponseEntity<List<Post>> getAll() {
        return ResponseEntity.ok(postService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getById(@PathVariable Integer id) {
        Optional<Post> result = postService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Post> create(@RequestBody PostDto dto) {
        Post entity = new Post();
        return ResponseEntity.ok(postService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> update(@PathVariable Integer id, @RequestBody PostDto dto) {
        Post entity = new Post();
        return ResponseEntity.ok(postService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        postService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}