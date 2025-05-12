package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.CommentLike;
import com.glody.glodyAPI.service.CommentLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commentLikes")
public class CommentLikeController {

    @Autowired
    private CommentLikeService commentLikeService;

    @GetMapping
    public ResponseEntity<List<CommentLike>> getAll() {
        List<CommentLike> list = commentLikeService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentLike> getById(@PathVariable Integer id) {
        return commentLikeService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CommentLike> create(@RequestBody CommentLike commentLike) {
        CommentLike saved = commentLikeService.save(commentLike);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CommentLike> update(@PathVariable Integer id, @RequestBody CommentLike commentLike) {
        CommentLike updated = commentLikeService.save(commentLike);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        commentLikeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}