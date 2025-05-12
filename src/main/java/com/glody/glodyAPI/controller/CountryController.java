package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Country;
import com.glody.glodyAPI.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countrys")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ResponseEntity<List<Country>> getAll() {
        List<Country> list = countryService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getById(@PathVariable Integer id) {
        return countryService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Country> create(@RequestBody Country country) {
        Country saved = countryService.save(country);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Country> update(@PathVariable Integer id, @RequestBody Country country) {
        Country updated = countryService.save(country);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        countryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}