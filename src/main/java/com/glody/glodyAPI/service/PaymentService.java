package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Payment;
import java.util.List;
import java.util.Optional;

public interface PaymentService {
    List<Payment> findAll();
    Optional<Payment> findById(Integer id);
    Payment save(Payment entity);
    void deleteById(Integer id);
}