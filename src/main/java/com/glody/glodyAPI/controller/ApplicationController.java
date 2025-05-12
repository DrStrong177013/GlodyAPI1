package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Application;
import com.glody.glodyAPI.model.dto.ApplicationDto;
import com.glody.glodyAPI.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping
    public ResponseEntity<List<Application>> getAll() {
        return ResponseEntity.ok(applicationService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Application> getById(@PathVariable Integer id) {
        Optional<Application> result = applicationService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Application> create(@RequestBody ApplicationDto dto) {
        Application entity = new Application();
        return ResponseEntity.ok(applicationService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Application> update(@PathVariable Integer id, @RequestBody ApplicationDto dto) {
        Application entity = new Application();
        return ResponseEntity.ok(applicationService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        applicationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}