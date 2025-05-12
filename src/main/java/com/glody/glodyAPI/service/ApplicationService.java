package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Application;
import java.util.List;
import java.util.Optional;

public interface ApplicationService {
    List<Application> findAll();
    Optional<Application> findById(Integer id);
    Application save(Application entity);
    void deleteById(Integer id);
}