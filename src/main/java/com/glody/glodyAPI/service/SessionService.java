package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Session;
import java.util.List;
import java.util.Optional;

public interface SessionService {
    List<Session> findAll();
    Optional<Session> findById(Integer id);
    Session save(Session entity);
    void deleteById(Integer id);
}