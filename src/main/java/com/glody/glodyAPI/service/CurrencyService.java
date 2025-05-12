package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Currency;
import java.util.List;
import java.util.Optional;

public interface CurrencyService {
    List<Currency> findAll();
    Optional<Currency> findById(String id);
    Currency save(Currency entity);
    void deleteById(String id);
}