package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.ProgramReview;
import com.glody.glodyAPI.service.ProgramReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programReviews")
public class ProgramReviewController {

    @Autowired
    private ProgramReviewService programReviewService;

    @GetMapping
    public ResponseEntity<List<ProgramReview>> getAll() {
        List<ProgramReview> list = programReviewService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProgramReview> getById(@PathVariable Integer id) {
        return programReviewService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProgramReview> create(@RequestBody ProgramReview programReview) {
        ProgramReview saved = programReviewService.save(programReview);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProgramReview> update(@PathVariable Integer id, @RequestBody ProgramReview programReview) {
        ProgramReview updated = programReviewService.save(programReview);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        programReviewService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}