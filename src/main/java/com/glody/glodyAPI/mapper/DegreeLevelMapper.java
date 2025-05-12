package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.DegreeLevel;
import com.glody.glodyAPI.model.dto.DegreeLevelDto;
import org.springframework.stereotype.Component;

@Component
public class DegreeLevelMapper {

    public DegreeLevel toEntity(DegreeLevelDto dto) {
        DegreeLevel entity = new DegreeLevel();
        // TODO: map fields from dto to entity
        return entity;
    }

    public DegreeLevelDto toDto(DegreeLevel entity) {
        DegreeLevelDto dto = new DegreeLevelDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}