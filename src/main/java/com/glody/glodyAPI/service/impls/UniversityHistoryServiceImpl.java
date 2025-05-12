package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.UniversityHistory;
import com.glody.glodyAPI.repository.UniversityHistoryRepository;
import com.glody.glodyAPI.service.UniversityHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityHistoryServiceImpl implements UniversityHistoryService {

    @Autowired
    private UniversityHistoryRepository repository;

    @Override
    public List<UniversityHistory> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<UniversityHistory> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public UniversityHistory save(UniversityHistory entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}