package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.ProgramReview;
import java.util.List;
import java.util.Optional;

public interface ProgramReviewService {
    List<ProgramReview> findAll();
    Optional<ProgramReview> findById(Integer id);
    ProgramReview save(ProgramReview entity);
    void deleteById(Integer id);
}