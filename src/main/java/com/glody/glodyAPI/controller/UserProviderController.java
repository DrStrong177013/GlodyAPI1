package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.UserProvider;
import com.glody.glodyAPI.service.UserProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userProviders")
public class UserProviderController {

    @Autowired
    private UserProviderService userProviderService;

    @GetMapping
    public ResponseEntity<List<UserProvider>> getAll() {
        List<UserProvider> list = userProviderService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserProvider> getById(@PathVariable Integer id) {
        return userProviderService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UserProvider> create(@RequestBody UserProvider userProvider) {
        UserProvider saved = userProviderService.save(userProvider);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserProvider> update(@PathVariable Integer id, @RequestBody UserProvider userProvider) {
        UserProvider updated = userProviderService.save(userProvider);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        userProviderService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}