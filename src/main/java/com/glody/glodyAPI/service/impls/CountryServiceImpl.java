package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.Country;
import com.glody.glodyAPI.repository.CountryRepository;
import com.glody.glodyAPI.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Country> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Country save(Country entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}