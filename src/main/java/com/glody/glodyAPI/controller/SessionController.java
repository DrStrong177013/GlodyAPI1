package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Session;
import com.glody.glodyAPI.model.dto.SessionDto;
import com.glody.glodyAPI.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping
    public ResponseEntity<List<Session>> getAll() {
        return ResponseEntity.ok(sessionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Session> getById(@PathVariable Integer id) {
        Optional<Session> result = sessionService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Session> create(@RequestBody SessionDto dto) {
        Session entity = new Session();
        return ResponseEntity.ok(sessionService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Session> update(@PathVariable Integer id, @RequestBody SessionDto dto) {
        Session entity = new Session();
        return ResponseEntity.ok(sessionService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        sessionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}