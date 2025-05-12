package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Program;
import com.glody.glodyAPI.model.dto.ProgramDto;
import org.springframework.stereotype.Component;

@Component
public class ProgramMapper {

    public Program toEntity(ProgramDto dto) {
        Program entity = new Program();
        // TODO: map fields from dto to entity
        return entity;
    }

    public ProgramDto toDto(Program entity) {
        ProgramDto dto = new ProgramDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}