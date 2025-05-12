package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.Session;
import com.glody.glodyAPI.repository.SessionRepository;
import com.glody.glodyAPI.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository repository;

    @Override
    public List<Session> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Session> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Session save(Session entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}