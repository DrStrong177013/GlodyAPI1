package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.UniversityHistory;
import com.glody.glodyAPI.model.dto.UniversityHistoryDto;
import com.glody.glodyAPI.service.UniversityHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/universityHistorys")
public class UniversityHistoryController {

    @Autowired
    private UniversityHistoryService universityHistoryService;

    @GetMapping
    public ResponseEntity<List<UniversityHistory>> getAll() {
        return ResponseEntity.ok(universityHistoryService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UniversityHistory> getById(@PathVariable Integer id) {
        Optional<UniversityHistory> result = universityHistoryService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UniversityHistory> create(@RequestBody UniversityHistoryDto dto) {
        UniversityHistory entity = new UniversityHistory();
        return ResponseEntity.ok(universityHistoryService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UniversityHistory> update(@PathVariable Integer id, @RequestBody UniversityHistoryDto dto) {
        UniversityHistory entity = new UniversityHistory();
        return ResponseEntity.ok(universityHistoryService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        universityHistoryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}