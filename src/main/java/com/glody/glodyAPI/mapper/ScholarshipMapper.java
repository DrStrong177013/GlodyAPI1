package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Scholarship;
import com.glody.glodyAPI.model.dto.ScholarshipDto;
import org.springframework.stereotype.Component;

@Component
public class ScholarshipMapper {

    public Scholarship toEntity(ScholarshipDto dto) {
        Scholarship entity = new Scholarship();
        // TODO: map fields from dto to entity
        return entity;
    }

    public ScholarshipDto toDto(Scholarship entity) {
        ScholarshipDto dto = new ScholarshipDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}