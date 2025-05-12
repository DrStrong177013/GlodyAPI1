package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.File;
import com.glody.glodyAPI.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping
    public ResponseEntity<List<File>> getAll() {
        List<File> list = fileService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<File> getById(@PathVariable Integer id) {
        return fileService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<File> create(@RequestBody File file) {
        File saved = fileService.save(file);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<File> update(@PathVariable Integer id, @RequestBody File file) {
        File updated = fileService.save(file);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        fileService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}