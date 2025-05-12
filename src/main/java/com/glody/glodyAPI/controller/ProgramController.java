package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Program;
import com.glody.glodyAPI.model.dto.ProgramDto;
import com.glody.glodyAPI.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/programs")
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @GetMapping
    public ResponseEntity<List<Program>> getAll() {
        return ResponseEntity.ok(programService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Program> getById(@PathVariable Integer id) {
        Optional<Program> result = programService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Program> create(@RequestBody ProgramDto dto) {
        Program entity = new Program();
        return ResponseEntity.ok(programService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Program> update(@PathVariable Integer id, @RequestBody ProgramDto dto) {
        Program entity = new Program();
        return ResponseEntity.ok(programService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        programService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}