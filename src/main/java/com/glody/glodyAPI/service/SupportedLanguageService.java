package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.SupportedLanguage;
import java.util.List;
import java.util.Optional;

public interface SupportedLanguageService {
    List<SupportedLanguage> findAll();
    Optional<SupportedLanguage> findById(String id);
    SupportedLanguage save(SupportedLanguage entity);
    void deleteById(String id);
}