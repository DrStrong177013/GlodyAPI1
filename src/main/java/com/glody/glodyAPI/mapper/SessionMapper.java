package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Session;
import com.glody.glodyAPI.model.dto.SessionDto;
import org.springframework.stereotype.Component;

@Component
public class SessionMapper {

    public Session toEntity(SessionDto dto) {
        Session entity = new Session();
        // TODO: map fields from dto to entity
        return entity;
    }

    public SessionDto toDto(Session entity) {
        SessionDto dto = new SessionDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}