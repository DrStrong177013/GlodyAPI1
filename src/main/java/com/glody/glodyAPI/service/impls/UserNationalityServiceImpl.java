package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.UserNationality;
import com.glody.glodyAPI.repository.UserNationalityRepository;
import com.glody.glodyAPI.service.UserNationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserNationalityServiceImpl implements UserNationalityService {

    @Autowired
    private UserNationalityRepository repository;

    @Override
    public List<UserNationality> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<UserNationality> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public UserNationality save(UserNationality entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}