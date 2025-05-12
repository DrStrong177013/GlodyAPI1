package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.DegreeLevel;
import com.glody.glodyAPI.service.DegreeLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/degreeLevels")
public class DegreeLevelController {

    @Autowired
    private DegreeLevelService degreeLevelService;

    @GetMapping
    public ResponseEntity<List<DegreeLevel>> getAll() {
        List<DegreeLevel> list = degreeLevelService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DegreeLevel> getById(@PathVariable Integer id) {
        return degreeLevelService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DegreeLevel> create(@RequestBody DegreeLevel degreeLevel) {
        DegreeLevel saved = degreeLevelService.save(degreeLevel);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DegreeLevel> update(@PathVariable Integer id, @RequestBody DegreeLevel degreeLevel) {
        DegreeLevel updated = degreeLevelService.save(degreeLevel);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        degreeLevelService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}