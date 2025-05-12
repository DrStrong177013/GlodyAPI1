package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Message;
import com.glody.glodyAPI.model.dto.MessageDto;
import org.springframework.stereotype.Component;

@Component
public class MessageMapper {

    public Message toEntity(MessageDto dto) {
        Message entity = new Message();
        // TODO: map fields from dto to entity
        return entity;
    }

    public MessageDto toDto(Message entity) {
        MessageDto dto = new MessageDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}