package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Role;
import com.glody.glodyAPI.model.dto.RoleDto;
import com.glody.glodyAPI.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public ResponseEntity<List<Role>> getAll() {
        return ResponseEntity.ok(roleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Role> getById(@PathVariable Integer id) {
        Optional<Role> result = roleService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Role> create(@RequestBody RoleDto dto) {
        Role entity = new Role();
        return ResponseEntity.ok(roleService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Role> update(@PathVariable Integer id, @RequestBody RoleDto dto) {
        Role entity = new Role();
        return ResponseEntity.ok(roleService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        roleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}