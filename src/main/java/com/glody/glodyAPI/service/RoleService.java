package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Role;
import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> findAll();
    Optional<Role> findById(Integer id);
    Role save(Role entity);
    void deleteById(Integer id);
}