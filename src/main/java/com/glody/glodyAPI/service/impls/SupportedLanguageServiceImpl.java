package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.SupportedLanguage;
import com.glody.glodyAPI.repository.SupportedLanguageRepository;
import com.glody.glodyAPI.service.SupportedLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupportedLanguageServiceImpl implements SupportedLanguageService {

    @Autowired
    private SupportedLanguageRepository repository;

    @Override
    public List<SupportedLanguage> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<SupportedLanguage> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public SupportedLanguage save(SupportedLanguage entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}