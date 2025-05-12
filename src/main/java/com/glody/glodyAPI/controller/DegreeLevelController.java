package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.DegreeLevel;
import com.glody.glodyAPI.model.dto.DegreeLevelDto;
import com.glody.glodyAPI.service.DegreeLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/degreeLevels")
public class DegreeLevelController {

    @Autowired
    private DegreeLevelService degreeLevelService;

    @GetMapping
    public ResponseEntity<List<DegreeLevel>> getAll() {
        return ResponseEntity.ok(degreeLevelService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DegreeLevel> getById(@PathVariable Integer id) {
        Optional<DegreeLevel> result = degreeLevelService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DegreeLevel> create(@RequestBody DegreeLevelDto dto) {
        DegreeLevel entity = new DegreeLevel();
        return ResponseEntity.ok(degreeLevelService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DegreeLevel> update(@PathVariable Integer id, @RequestBody DegreeLevelDto dto) {
        DegreeLevel entity = new DegreeLevel();
        return ResponseEntity.ok(degreeLevelService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        degreeLevelService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}