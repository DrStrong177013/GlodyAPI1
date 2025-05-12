package com.glody.glodyAPI.repository;

import com.glody.glodyAPI.model.entity.ProgramReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramReviewRepository extends JpaRepository<ProgramReview, Integer> {
}