package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Comment;
import com.glody.glodyAPI.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public ResponseEntity<List<Comment>> getAll() {
        List<Comment> list = commentService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comment> getById(@PathVariable Integer id) {
        return commentService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Comment> create(@RequestBody Comment comment) {
        Comment saved = commentService.save(comment);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Comment> update(@PathVariable Integer id, @RequestBody Comment comment) {
        Comment updated = commentService.save(comment);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        commentService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}