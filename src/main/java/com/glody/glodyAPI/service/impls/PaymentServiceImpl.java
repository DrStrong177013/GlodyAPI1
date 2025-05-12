package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.Payment;
import com.glody.glodyAPI.repository.PaymentRepository;
import com.glody.glodyAPI.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository repository;

    @Override
    public List<Payment> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Payment> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Payment save(Payment entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}