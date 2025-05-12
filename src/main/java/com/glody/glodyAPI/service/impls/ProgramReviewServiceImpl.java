package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.ProgramReview;
import com.glody.glodyAPI.repository.ProgramReviewRepository;
import com.glody.glodyAPI.service.ProgramReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramReviewServiceImpl implements ProgramReviewService {

    @Autowired
    private ProgramReviewRepository repository;

    @Override
    public List<ProgramReview> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ProgramReview> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public ProgramReview save(ProgramReview entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}