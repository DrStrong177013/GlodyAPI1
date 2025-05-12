package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Permission;
import com.glody.glodyAPI.model.dto.PermissionDto;
import com.glody.glodyAPI.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping
    public ResponseEntity<List<Permission>> getAll() {
        return ResponseEntity.ok(permissionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Permission> getById(@PathVariable Integer id) {
        Optional<Permission> result = permissionService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Permission> create(@RequestBody PermissionDto dto) {
        Permission entity = new Permission();
        return ResponseEntity.ok(permissionService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Permission> update(@PathVariable Integer id, @RequestBody PermissionDto dto) {
        Permission entity = new Permission();
        return ResponseEntity.ok(permissionService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        permissionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}