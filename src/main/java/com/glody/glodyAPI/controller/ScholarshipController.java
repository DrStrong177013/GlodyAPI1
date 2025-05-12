package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Scholarship;
import com.glody.glodyAPI.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scholarships")
public class ScholarshipController {

    @Autowired
    private ScholarshipService scholarshipService;

    @GetMapping
    public ResponseEntity<List<Scholarship>> getAll() {
        List<Scholarship> list = scholarshipService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Scholarship> getById(@PathVariable Integer id) {
        return scholarshipService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Scholarship> create(@RequestBody Scholarship scholarship) {
        Scholarship saved = scholarshipService.save(scholarship);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Scholarship> update(@PathVariable Integer id, @RequestBody Scholarship scholarship) {
        Scholarship updated = scholarshipService.save(scholarship);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        scholarshipService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}