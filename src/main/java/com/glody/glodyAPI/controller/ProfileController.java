package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Profile;
import com.glody.glodyAPI.model.dto.ProfileDto;
import com.glody.glodyAPI.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping
    public ResponseEntity<List<Profile>> getAll() {
        return ResponseEntity.ok(profileService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profile> getById(@PathVariable Integer id) {
        Optional<Profile> result = profileService.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Profile> create(@RequestBody ProfileDto dto) {
        Profile entity = new Profile();
        return ResponseEntity.ok(profileService.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profile> update(@PathVariable Integer id, @RequestBody ProfileDto dto) {
        Profile entity = new Profile();
        return ResponseEntity.ok(profileService.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        profileService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}