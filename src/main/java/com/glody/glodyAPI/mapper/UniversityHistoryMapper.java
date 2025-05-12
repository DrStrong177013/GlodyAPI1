package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.UniversityHistory;
import com.glody.glodyAPI.model.dto.UniversityHistoryDto;
import org.springframework.stereotype.Component;

@Component
public class UniversityHistoryMapper {

    public UniversityHistory toEntity(UniversityHistoryDto dto) {
        UniversityHistory entity = new UniversityHistory();
        // TODO: map fields from dto to entity
        return entity;
    }

    public UniversityHistoryDto toDto(UniversityHistory entity) {
        UniversityHistoryDto dto = new UniversityHistoryDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}