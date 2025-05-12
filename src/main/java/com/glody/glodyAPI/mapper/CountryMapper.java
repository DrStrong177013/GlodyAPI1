package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Country;
import com.glody.glodyAPI.model.dto.CountryDto;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper {

    public Country toEntity(CountryDto dto) {
        Country entity = new Country();
        // TODO: map fields from dto to entity
        return entity;
    }

    public CountryDto toDto(Country entity) {
        CountryDto dto = new CountryDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}