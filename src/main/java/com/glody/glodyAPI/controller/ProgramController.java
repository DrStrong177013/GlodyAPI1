package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Program;
import com.glody.glodyAPI.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programs")
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @GetMapping
    public ResponseEntity<List<Program>> getAll() {
        List<Program> list = programService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Program> getById(@PathVariable Integer id) {
        return programService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Program> create(@RequestBody Program program) {
        Program saved = programService.save(program);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Program> update(@PathVariable Integer id, @RequestBody Program program) {
        Program updated = programService.save(program);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        programService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}