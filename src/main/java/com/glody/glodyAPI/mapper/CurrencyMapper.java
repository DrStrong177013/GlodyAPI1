package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Currency;
import com.glody.glodyAPI.model.dto.CurrencyDto;
import org.springframework.stereotype.Component;

@Component
public class CurrencyMapper {

    public Currency toEntity(CurrencyDto dto) {
        Currency entity = new Currency();
        // TODO: map fields from dto to entity
        return entity;
    }

    public CurrencyDto toDto(Currency entity) {
        CurrencyDto dto = new CurrencyDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}