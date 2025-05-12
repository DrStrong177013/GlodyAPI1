package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.University;
import com.glody.glodyAPI.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/universitys")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping
    public ResponseEntity<List<University>> getAll() {
        List<University> list = universityService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<University> getById(@PathVariable Integer id) {
        return universityService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<University> create(@RequestBody University university) {
        University saved = universityService.save(university);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<University> update(@PathVariable Integer id, @RequestBody University university) {
        University updated = universityService.save(university);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        universityService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}