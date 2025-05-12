package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.UserRole;
import com.glody.glodyAPI.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userRoles")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    @GetMapping
    public ResponseEntity<List<UserRole>> getAll() {
        List<UserRole> list = userRoleService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserRole> getById(@PathVariable Integer id) {
        return userRoleService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UserRole> create(@RequestBody UserRole userRole) {
        UserRole saved = userRoleService.save(userRole);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserRole> update(@PathVariable Integer id, @RequestBody UserRole userRole) {
        UserRole updated = userRoleService.save(userRole);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        userRoleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}