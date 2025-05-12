package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.Post;
import com.glody.glodyAPI.model.dto.PostDto;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

    public Post toEntity(PostDto dto) {
        Post entity = new Post();
        // TODO: map fields from dto to entity
        return entity;
    }

    public PostDto toDto(Post entity) {
        PostDto dto = new PostDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}