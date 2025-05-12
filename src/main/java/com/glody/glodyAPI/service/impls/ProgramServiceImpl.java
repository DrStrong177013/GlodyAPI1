package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.Program;
import com.glody.glodyAPI.repository.ProgramRepository;
import com.glody.glodyAPI.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramServiceImpl implements ProgramService {

    @Autowired
    private ProgramRepository repository;

    @Override
    public List<Program> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Program> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Program save(Program entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}