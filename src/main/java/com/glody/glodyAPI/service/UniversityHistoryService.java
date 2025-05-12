package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.UniversityHistory;
import java.util.List;
import java.util.Optional;

public interface UniversityHistoryService {
    List<UniversityHistory> findAll();
    Optional<UniversityHistory> findById(Integer id);
    UniversityHistory save(UniversityHistory entity);
    void deleteById(Integer id);
}