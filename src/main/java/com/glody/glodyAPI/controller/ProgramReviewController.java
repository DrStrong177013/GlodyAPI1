package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.ProgramReview;
import com.glody.glodyAPI.model.dto.ProgramReviewDto;
import com.glody.glodyAPI.service.ProgramReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/programReviews")
public class ProgramReviewController {

    @Autowired
    private ProgramReviewService programReviewService;

    @GetMapping
    public ResponseEntity<List<ProgramReview>> getAll() {
        return ResponseEntity.ok(programReviewService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProgramReview> getById(@PathVariable Integer id) {
        Optional<ProgramReview> result = programReviewService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProgramReview> create(@RequestBody ProgramReviewDto dto) {
        ProgramReview entity = new ProgramReview();
        return ResponseEntity.ok(programReviewService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProgramReview> update(@PathVariable Integer id, @RequestBody ProgramReviewDto dto) {
        ProgramReview entity = new ProgramReview();
        return ResponseEntity.ok(programReviewService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        programReviewService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}