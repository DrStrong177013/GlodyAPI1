package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Message;
import com.glody.glodyAPI.model.dto.MessageDto;
import com.glody.glodyAPI.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public ResponseEntity<List<Message>> getAll() {
        return ResponseEntity.ok(messageService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Message> getById(@PathVariable Integer id) {
        Optional<Message> result = messageService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Message> create(@RequestBody MessageDto dto) {
        Message entity = new Message();
        return ResponseEntity.ok(messageService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Message> update(@PathVariable Integer id, @RequestBody MessageDto dto) {
        Message entity = new Message();
        return ResponseEntity.ok(messageService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        messageService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}