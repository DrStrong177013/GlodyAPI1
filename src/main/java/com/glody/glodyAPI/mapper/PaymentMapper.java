package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Payment;
import com.glody.glodyAPI.model.dto.PaymentDto;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {

    public Payment toEntity(PaymentDto dto) {
        Payment entity = new Payment();
        // TODO: map fields from dto to entity
        return entity;
    }

    public PaymentDto toDto(Payment entity) {
        PaymentDto dto = new PaymentDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}