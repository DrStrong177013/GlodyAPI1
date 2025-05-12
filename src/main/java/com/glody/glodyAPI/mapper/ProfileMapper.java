package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Profile;
import com.glody.glodyAPI.model.dto.ProfileDto;
import org.springframework.stereotype.Component;

@Component
public class ProfileMapper {

    public Profile toEntity(ProfileDto dto) {
        Profile entity = new Profile();
        // TODO: map fields from dto to entity
        return entity;
    }

    public ProfileDto toDto(Profile entity) {
        ProfileDto dto = new ProfileDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}