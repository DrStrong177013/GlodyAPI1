package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Payment;
import com.glody.glodyAPI.model.dto.PaymentDto;
import com.glody.glodyAPI.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public ResponseEntity<List<Payment>> getAll() {
        return ResponseEntity.ok(paymentService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payment> getById(@PathVariable Integer id) {
        Optional<Payment> result = paymentService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Payment> create(@RequestBody PaymentDto dto) {
        Payment entity = new Payment();
        return ResponseEntity.ok(paymentService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Payment> update(@PathVariable Integer id, @RequestBody PaymentDto dto) {
        Payment entity = new Payment();
        return ResponseEntity.ok(paymentService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        paymentService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}