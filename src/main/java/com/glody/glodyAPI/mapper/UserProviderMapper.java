package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.UserProvider;
import com.glody.glodyAPI.model.dto.UserProviderDto;
import org.springframework.stereotype.Component;

@Component
public class UserProviderMapper {

    public UserProvider toEntity(UserProviderDto dto) {
        UserProvider entity = new UserProvider();
        // TODO: map fields from dto to entity
        return entity;
    }

    public UserProviderDto toDto(UserProvider entity) {
        UserProviderDto dto = new UserProviderDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}