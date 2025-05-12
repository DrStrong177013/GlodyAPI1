package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.Profile;
import com.glody.glodyAPI.repository.ProfileRepository;
import com.glody.glodyAPI.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository repository;

    @Override
    public List<Profile> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Profile> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Profile save(Profile entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}