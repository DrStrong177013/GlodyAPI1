package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.University;
import java.util.List;
import java.util.Optional;

public interface UniversityService {
    List<University> findAll();
    Optional<University> findById(Integer id);
    University save(University entity);
    void deleteById(Integer id);
}