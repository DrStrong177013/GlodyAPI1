package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.File;
import com.glody.glodyAPI.model.dto.FileDto;
import com.glody.glodyAPI.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping
    public ResponseEntity<List<File>> getAll() {
        return ResponseEntity.ok(fileService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<File> getById(@PathVariable Integer id) {
        Optional<File> result = fileService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<File> create(@RequestBody FileDto dto) {
        File entity = new File();
        return ResponseEntity.ok(fileService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<File> update(@PathVariable Integer id, @RequestBody FileDto dto) {
        File entity = new File();
        return ResponseEntity.ok(fileService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        fileService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}