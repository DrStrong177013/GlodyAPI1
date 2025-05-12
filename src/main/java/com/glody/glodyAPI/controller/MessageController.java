package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Message;
import com.glody.glodyAPI.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public ResponseEntity<List<Message>> getAll() {
        List<Message> list = messageService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Message> getById(@PathVariable Integer id) {
        return messageService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Message> create(@RequestBody Message message) {
        Message saved = messageService.save(message);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Message> update(@PathVariable Integer id, @RequestBody Message message) {
        Message updated = messageService.save(message);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        messageService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}