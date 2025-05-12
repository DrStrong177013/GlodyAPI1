package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.UserRole;
import com.glody.glodyAPI.repository.UserRoleRepository;
import com.glody.glodyAPI.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository repository;

    @Override
    public List<UserRole> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<UserRole> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public UserRole save(UserRole entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}