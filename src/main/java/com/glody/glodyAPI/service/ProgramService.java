package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Program;
import java.util.List;
import java.util.Optional;

public interface ProgramService {
    List<Program> findAll();
    Optional<Program> findById(Integer id);
    Program save(Program entity);
    void deleteById(Integer id);
}