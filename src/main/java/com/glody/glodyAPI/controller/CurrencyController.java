package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Currency;
import com.glody.glodyAPI.model.dto.CurrencyDto;
import com.glody.glodyAPI.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/currencys")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping
    public ResponseEntity<List<Currency>> getAll() {
        return ResponseEntity.ok(currencyService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Currency> getById(@PathVariable String id) {
        Optional<Currency> result = currencyService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Currency> create(@RequestBody CurrencyDto dto) {
        Currency entity = new Currency();
        return ResponseEntity.ok(currencyService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Currency> update(@PathVariable String id, @RequestBody CurrencyDto dto) {
        Currency entity = new Currency();
        return ResponseEntity.ok(currencyService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        currencyService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}