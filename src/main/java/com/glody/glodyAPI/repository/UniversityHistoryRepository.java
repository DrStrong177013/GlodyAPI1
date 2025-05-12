package com.glody.glodyAPI.repository;

import com.glody.glodyAPI.model.entity.UniversityHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityHistoryRepository extends JpaRepository<UniversityHistory, Integer> {
}