package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.UserProvider;
import com.glody.glodyAPI.model.dto.UserProviderDto;
import com.glody.glodyAPI.service.UserProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/userProviders")
public class UserProviderController {

    @Autowired
    private UserProviderService userProviderService;

    @GetMapping
    public ResponseEntity<List<UserProvider>> getAll() {
        return ResponseEntity.ok(userProviderService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserProvider> getById(@PathVariable Integer id) {
        Optional<UserProvider> result = userProviderService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UserProvider> create(@RequestBody UserProviderDto dto) {
        UserProvider entity = new UserProvider();
        return ResponseEntity.ok(userProviderService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserProvider> update(@PathVariable Integer id, @RequestBody UserProviderDto dto) {
        UserProvider entity = new UserProvider();
        return ResponseEntity.ok(userProviderService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        userProviderService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}