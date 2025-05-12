package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.UserNationality;
import com.glody.glodyAPI.service.UserNationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userNationalitys")
public class UserNationalityController {

    @Autowired
    private UserNationalityService userNationalityService;

    @GetMapping
    public ResponseEntity<List<UserNationality>> getAll() {
        List<UserNationality> list = userNationalityService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserNationality> getById(@PathVariable Integer id) {
        return userNationalityService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UserNationality> create(@RequestBody UserNationality userNationality) {
        UserNationality saved = userNationalityService.save(userNationality);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserNationality> update(@PathVariable Integer id, @RequestBody UserNationality userNationality) {
        UserNationality updated = userNationalityService.save(userNationality);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        userNationalityService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}