package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.UniversityHistory;
import com.glody.glodyAPI.service.UniversityHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/universityHistorys")
public class UniversityHistoryController {

    @Autowired
    private UniversityHistoryService universityHistoryService;

    @GetMapping
    public ResponseEntity<List<UniversityHistory>> getAll() {
        List<UniversityHistory> list = universityHistoryService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UniversityHistory> getById(@PathVariable Integer id) {
        return universityHistoryService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UniversityHistory> create(@RequestBody UniversityHistory universityHistory) {
        UniversityHistory saved = universityHistoryService.save(universityHistory);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UniversityHistory> update(@PathVariable Integer id, @RequestBody UniversityHistory universityHistory) {
        UniversityHistory updated = universityHistoryService.save(universityHistory);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        universityHistoryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}