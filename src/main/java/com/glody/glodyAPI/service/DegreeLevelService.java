package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.DegreeLevel;
import java.util.List;
import java.util.Optional;

public interface DegreeLevelService {
    List<DegreeLevel> findAll();
    Optional<DegreeLevel> findById(Integer id);
    DegreeLevel save(DegreeLevel entity);
    void deleteById(Integer id);
}