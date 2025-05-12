package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.PostLike;
import com.glody.glodyAPI.service.PostLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postLikes")
public class PostLikeController {

    @Autowired
    private PostLikeService postLikeService;

    @GetMapping
    public ResponseEntity<List<PostLike>> getAll() {
        List<PostLike> list = postLikeService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostLike> getById(@PathVariable Integer id) {
        return postLikeService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PostLike> create(@RequestBody PostLike postLike) {
        PostLike saved = postLikeService.save(postLike);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostLike> update(@PathVariable Integer id, @RequestBody PostLike postLike) {
        PostLike updated = postLikeService.save(postLike);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        postLikeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}