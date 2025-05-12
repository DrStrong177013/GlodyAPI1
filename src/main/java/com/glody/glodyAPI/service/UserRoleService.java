package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.UserRole;
import java.util.List;
import java.util.Optional;

public interface UserRoleService {
    List<UserRole> findAll();
    Optional<UserRole> findById(Integer id);
    UserRole save(UserRole entity);
    void deleteById(Integer id);
}