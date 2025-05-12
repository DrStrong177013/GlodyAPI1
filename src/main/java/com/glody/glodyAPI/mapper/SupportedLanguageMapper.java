package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.SupportedLanguage;
import com.glody.glodyAPI.model.dto.SupportedLanguageDto;
import org.springframework.stereotype.Component;

@Component
public class SupportedLanguageMapper {

    public SupportedLanguage toEntity(SupportedLanguageDto dto) {
        SupportedLanguage entity = new SupportedLanguage();
        // TODO: map fields from dto to entity
        return entity;
    }

    public SupportedLanguageDto toDto(SupportedLanguage entity) {
        SupportedLanguageDto dto = new SupportedLanguageDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}