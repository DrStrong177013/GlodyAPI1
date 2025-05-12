package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Session;
import com.glody.glodyAPI.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping
    public ResponseEntity<List<Session>> getAll() {
        List<Session> list = sessionService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Session> getById(@PathVariable Integer id) {
        return sessionService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Session> create(@RequestBody Session session) {
        Session saved = sessionService.save(session);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Session> update(@PathVariable Integer id, @RequestBody Session session) {
        Session updated = sessionService.save(session);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        sessionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}