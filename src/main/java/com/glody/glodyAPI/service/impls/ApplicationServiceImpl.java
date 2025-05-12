package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.Application;
import com.glody.glodyAPI.repository.ApplicationRepository;
import com.glody.glodyAPI.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository repository;

    @Override
    public List<Application> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Application> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Application save(Application entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}