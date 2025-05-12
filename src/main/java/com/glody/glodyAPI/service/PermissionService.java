package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Permission;
import java.util.List;
import java.util.Optional;

public interface PermissionService {
    List<Permission> findAll();
    Optional<Permission> findById(Integer id);
    Permission save(Permission entity);
    void deleteById(Integer id);
}