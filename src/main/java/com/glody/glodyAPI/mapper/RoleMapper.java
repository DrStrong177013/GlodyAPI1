package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Role;
import com.glody.glodyAPI.model.dto.RoleDto;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

    public Role toEntity(RoleDto dto) {
        Role entity = new Role();
        // TODO: map fields from dto to entity
        return entity;
    }

    public RoleDto toDto(Role entity) {
        RoleDto dto = new RoleDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}