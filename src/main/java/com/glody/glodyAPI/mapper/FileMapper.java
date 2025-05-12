package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.File;
import com.glody.glodyAPI.model.dto.FileDto;
import org.springframework.stereotype.Component;

@Component
public class FileMapper {

    public File toEntity(FileDto dto) {
        File entity = new File();
        // TODO: map fields from dto to entity
        return entity;
    }

    public FileDto toDto(File entity) {
        FileDto dto = new FileDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}