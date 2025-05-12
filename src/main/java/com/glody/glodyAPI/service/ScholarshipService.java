package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Scholarship;
import java.util.List;
import java.util.Optional;

public interface ScholarshipService {
    List<Scholarship> findAll();
    Optional<Scholarship> findById(Integer id);
    Scholarship save(Scholarship entity);
    void deleteById(Integer id);
}