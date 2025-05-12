package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.Currency;
import com.glody.glodyAPI.repository.CurrencyRepository;
import com.glody.glodyAPI.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyRepository repository;

    @Override
    public List<Currency> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Currency> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Currency save(Currency entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}