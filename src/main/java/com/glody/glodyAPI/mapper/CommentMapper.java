package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Comment;
import com.glody.glodyAPI.model.dto.CommentDto;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper {

    public Comment toEntity(CommentDto dto) {
        Comment entity = new Comment();
        // TODO: map fields from dto to entity
        return entity;
    }

    public CommentDto toDto(Comment entity) {
        CommentDto dto = new CommentDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}