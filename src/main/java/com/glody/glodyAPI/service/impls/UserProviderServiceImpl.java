package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.UserProvider;
import com.glody.glodyAPI.repository.UserProviderRepository;
import com.glody.glodyAPI.service.UserProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserProviderServiceImpl implements UserProviderService {

    @Autowired
    private UserProviderRepository repository;

    @Override
    public List<UserProvider> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<UserProvider> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public UserProvider save(UserProvider entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}