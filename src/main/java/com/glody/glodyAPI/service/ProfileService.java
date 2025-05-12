package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Profile;
import java.util.List;
import java.util.Optional;

public interface ProfileService {
    List<Profile> findAll();
    Optional<Profile> findById(Integer id);
    Profile save(Profile entity);
    void deleteById(Integer id);
}