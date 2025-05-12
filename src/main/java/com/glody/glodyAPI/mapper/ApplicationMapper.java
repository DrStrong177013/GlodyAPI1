package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Application;
import com.glody.glodyAPI.model.dto.ApplicationDto;
import org.springframework.stereotype.Component;

@Component
public class ApplicationMapper {

    public Application toEntity(ApplicationDto dto) {
        Application entity = new Application();
        // TODO: map fields from dto to entity
        return entity;
    }

    public ApplicationDto toDto(Application entity) {
        ApplicationDto dto = new ApplicationDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}