package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Application;
import com.glody.glodyAPI.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping
    public ResponseEntity<List<Application>> getAll() {
        List<Application> list = applicationService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Application> getById(@PathVariable Integer id) {
        return applicationService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Application> create(@RequestBody Application application) {
        Application saved = applicationService.save(application);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Application> update(@PathVariable Integer id, @RequestBody Application application) {
        Application updated = applicationService.save(application);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        applicationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}