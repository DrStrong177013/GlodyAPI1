package com.glody.glodyAPI.controller;

import com.glody.glodyAPI.model.entity.Profile;
import com.glody.glodyAPI.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping
    public ResponseEntity<List<Profile>> getAll() {
        List<Profile> list = profileService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profile> getById(@PathVariable Integer id) {
        return profileService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Profile> create(@RequestBody Profile profile) {
        Profile saved = profileService.save(profile);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profile> update(@PathVariable Integer id, @RequestBody Profile profile) {
        Profile updated = profileService.save(profile);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        profileService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}