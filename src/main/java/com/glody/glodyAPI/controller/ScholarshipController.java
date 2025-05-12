package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Scholarship;
import com.glody.glodyAPI.model.dto.ScholarshipDto;
import com.glody.glodyAPI.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/scholarships")
public class ScholarshipController {

    @Autowired
    private ScholarshipService scholarshipService;

    @GetMapping
    public ResponseEntity<List<Scholarship>> getAll() {
        return ResponseEntity.ok(scholarshipService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Scholarship> getById(@PathVariable Integer id) {
        Optional<Scholarship> result = scholarshipService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Scholarship> create(@RequestBody ScholarshipDto dto) {
        Scholarship entity = new Scholarship();
        return ResponseEntity.ok(scholarshipService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Scholarship> update(@PathVariable Integer id, @RequestBody ScholarshipDto dto) {
        Scholarship entity = new Scholarship();
        return ResponseEntity.ok(scholarshipService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        scholarshipService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}