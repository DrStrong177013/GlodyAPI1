package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.Permission;
import com.glody.glodyAPI.repository.PermissionRepository;
import com.glody.glodyAPI.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository repository;

    @Override
    public List<Permission> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Permission> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Permission save(Permission entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}