package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Country;
import java.util.List;
import java.util.Optional;

public interface CountryService {
    List<Country> findAll();
    Optional<Country> findById(Integer id);
    Country save(Country entity);
    void deleteById(Integer id);
}