package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.Scholarship;
import com.glody.glodyAPI.repository.ScholarshipRepository;
import com.glody.glodyAPI.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScholarshipServiceImpl implements ScholarshipService {

    @Autowired
    private ScholarshipRepository repository;

    @Override
    public List<Scholarship> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Scholarship> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Scholarship save(Scholarship entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}