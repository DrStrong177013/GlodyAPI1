package com.glody.glodyAPI.mapper;

import com.glody.glodyAPI.model.entity.ProgramReview;
import com.glody.glodyAPI.model.dto.ProgramReviewDto;
import org.springframework.stereotype.Component;

@Component
public class ProgramReviewMapper {

    public ProgramReview toEntity(ProgramReviewDto dto) {
        ProgramReview entity = new ProgramReview();
        // TODO: map fields from dto to entity
        return entity;
    }

    public ProgramReviewDto toDto(ProgramReview entity) {
        ProgramReviewDto dto = new ProgramReviewDto();
        // TODO: map fields from entity to dto
        return dto;
    }
}