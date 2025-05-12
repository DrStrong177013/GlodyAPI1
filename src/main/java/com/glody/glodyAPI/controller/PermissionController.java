package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Permission;
import com.glody.glodyAPI.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping
    public ResponseEntity<List<Permission>> getAll() {
        List<Permission> list = permissionService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Permission> getById(@PathVariable Integer id) {
        return permissionService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Permission> create(@RequestBody Permission permission) {
        Permission saved = permissionService.save(permission);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Permission> update(@PathVariable Integer id, @RequestBody Permission permission) {
        Permission updated = permissionService.save(permission);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        permissionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}