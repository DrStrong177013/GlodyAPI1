package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.University;
import com.glody.glodyAPI.model.dto.UniversityDto;
import com.glody.glodyAPI.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/universitys")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping
    public ResponseEntity<List<University>> getAll() {
        return ResponseEntity.ok(universityService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<University> getById(@PathVariable Integer id) {
        Optional<University> result = universityService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<University> create(@RequestBody UniversityDto dto) {
        University entity = new University();
        return ResponseEntity.ok(universityService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<University> update(@PathVariable Integer id, @RequestBody UniversityDto dto) {
        University entity = new University();
        return ResponseEntity.ok(universityService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        universityService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}