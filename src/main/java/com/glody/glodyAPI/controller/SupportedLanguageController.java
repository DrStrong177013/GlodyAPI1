package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.SupportedLanguage;
import com.glody.glodyAPI.model.dto.SupportedLanguageDto;
import com.glody.glodyAPI.service.SupportedLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/supportedLanguages")
public class SupportedLanguageController {

    @Autowired
    private SupportedLanguageService supportedLanguageService;

    @GetMapping
    public ResponseEntity<List<SupportedLanguage>> getAll() {
        return ResponseEntity.ok(supportedLanguageService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupportedLanguage> getById(@PathVariable String id) {
        Optional<SupportedLanguage> result = supportedLanguageService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SupportedLanguage> create(@RequestBody SupportedLanguageDto dto) {
        SupportedLanguage entity = new SupportedLanguage();
        return ResponseEntity.ok(supportedLanguageService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupportedLanguage> update(@PathVariable String id, @RequestBody SupportedLanguageDto dto) {
        SupportedLanguage entity = new SupportedLanguage();
        return ResponseEntity.ok(supportedLanguageService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        supportedLanguageService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}