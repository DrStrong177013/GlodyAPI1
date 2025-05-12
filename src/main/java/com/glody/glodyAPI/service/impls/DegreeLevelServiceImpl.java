package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.DegreeLevel;
import com.glody.glodyAPI.repository.DegreeLevelRepository;
import com.glody.glodyAPI.service.DegreeLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DegreeLevelServiceImpl implements DegreeLevelService {

    @Autowired
    private DegreeLevelRepository repository;

    @Override
    public List<DegreeLevel> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<DegreeLevel> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public DegreeLevel save(DegreeLevel entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}