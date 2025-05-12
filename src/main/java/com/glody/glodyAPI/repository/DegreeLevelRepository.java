package com.glody.glodyAPI.repository;

import com.glody.glodyAPI.model.entity.DegreeLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegreeLevelRepository extends JpaRepository<DegreeLevel, Integer> {
}