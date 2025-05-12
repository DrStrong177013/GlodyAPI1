package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.User;
import com.glody.glodyAPI.model.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserDto dto) {
        User entity = new User();
        // TODO: map fields from dto to entity
        return entity;
    }

    public UserDto toDto(User entity) {
        UserDto dto = new UserDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}