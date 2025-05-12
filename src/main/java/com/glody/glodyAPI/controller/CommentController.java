package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Comment;
import com.glody.glodyAPI.model.dto.CommentDto;
import com.glody.glodyAPI.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public ResponseEntity<List<Comment>> getAll() {
        return ResponseEntity.ok(commentService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comment> getById(@PathVariable Integer id) {
        Optional<Comment> result = commentService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Comment> create(@RequestBody CommentDto dto) {
        Comment entity = new Comment();
        return ResponseEntity.ok(commentService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Comment> update(@PathVariable Integer id, @RequestBody CommentDto dto) {
        Comment entity = new Comment();
        return ResponseEntity.ok(commentService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        commentService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}