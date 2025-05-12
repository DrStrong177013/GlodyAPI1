package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.UserNationality;
import com.glody.glodyAPI.model.dto.UserNationalityDto;
import com.glody.glodyAPI.service.UserNationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/userNationalitys")
public class UserNationalityController {

    @Autowired
    private UserNationalityService userNationalityService;

    @GetMapping
    public ResponseEntity<List<UserNationality>> getAll() {
        return ResponseEntity.ok(userNationalityService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserNationality> getById(@PathVariable Integer id) {
        Optional<UserNationality> result = userNationalityService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UserNationality> create(@RequestBody UserNationalityDto dto) {
        UserNationality entity = new UserNationality();
        return ResponseEntity.ok(userNationalityService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserNationality> update(@PathVariable Integer id, @RequestBody UserNationalityDto dto) {
        UserNationality entity = new UserNationality();
        return ResponseEntity.ok(userNationalityService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        userNationalityService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}