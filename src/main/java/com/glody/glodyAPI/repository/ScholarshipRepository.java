package com.glody.glodyAPI.repository;

import com.glody.glodyAPI.model.entity.Scholarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScholarshipRepository extends JpaRepository<Scholarship, Integer> {
}