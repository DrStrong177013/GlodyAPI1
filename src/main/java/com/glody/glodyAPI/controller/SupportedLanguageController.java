package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.SupportedLanguage;
import com.glody.glodyAPI.service.SupportedLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supportedLanguages")
public class SupportedLanguageController {

    @Autowired
    private SupportedLanguageService supportedLanguageService;

    @GetMapping
    public ResponseEntity<List<SupportedLanguage>> getAll() {
        List<SupportedLanguage> list = supportedLanguageService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupportedLanguage> getById(@PathVariable String id) {
        return supportedLanguageService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SupportedLanguage> create(@RequestBody SupportedLanguage supportedLanguage) {
        SupportedLanguage saved = supportedLanguageService.save(supportedLanguage);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupportedLanguage> update(@PathVariable String id, @RequestBody SupportedLanguage supportedLanguage) {
        SupportedLanguage updated = supportedLanguageService.save(supportedLanguage);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        supportedLanguageService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}