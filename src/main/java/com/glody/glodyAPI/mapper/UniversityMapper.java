package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.University;
import com.glody.glodyAPI.model.dto.UniversityDto;
import org.springframework.stereotype.Component;

@Component
public class UniversityMapper {

    public University toEntity(UniversityDto dto) {
        University entity = new University();
        // TODO: map fields from dto to entity
        return entity;
    }

    public UniversityDto toDto(University entity) {
        UniversityDto dto = new UniversityDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}