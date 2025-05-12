package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.UserProvider;
import java.util.List;
import java.util.Optional;

public interface UserProviderService {
    List<UserProvider> findAll();
    Optional<UserProvider> findById(Integer id);
    UserProvider save(UserProvider entity);
    void deleteById(Integer id);
}