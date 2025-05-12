package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Currency;
import com.glody.glodyAPI.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/currencys")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping
    public ResponseEntity<List<Currency>> getAll() {
        List<Currency> list = currencyService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Currency> getById(@PathVariable String id) {
        return currencyService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Currency> create(@RequestBody Currency currency) {
        Currency saved = currencyService.save(currency);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Currency> update(@PathVariable String id, @RequestBody Currency currency) {
        Currency updated = currencyService.save(currency);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        currencyService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}