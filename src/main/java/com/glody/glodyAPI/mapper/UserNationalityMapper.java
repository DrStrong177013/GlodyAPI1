package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.UserNationality;
import com.glody.glodyAPI.model.dto.UserNationalityDto;
import org.springframework.stereotype.Component;

@Component
public class UserNationalityMapper {

    public UserNationality toEntity(UserNationalityDto dto) {
        UserNationality entity = new UserNationality();
        // TODO: map fields from dto to entity
        return entity;
    }

    public UserNationalityDto toDto(UserNationality entity) {
        UserNationalityDto dto = new UserNationalityDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}