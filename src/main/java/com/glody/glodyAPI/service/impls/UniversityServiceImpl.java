package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.University;
import com.glody.glodyAPI.repository.UniversityRepository;
import com.glody.glodyAPI.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private UniversityRepository repository;

    @Override
    public List<University> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<University> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public University save(University entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}