package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Permission;
import com.glody.glodyAPI.model.dto.PermissionDto;
import org.springframework.stereotype.Component;

@Component
public class PermissionMapper {

    public Permission toEntity(PermissionDto dto) {
        Permission entity = new Permission();
        // TODO: map fields from dto to entity
        return entity;
    }

    public PermissionDto toDto(Permission entity) {
        PermissionDto dto = new PermissionDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}