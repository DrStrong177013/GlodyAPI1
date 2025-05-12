package com.glody.glodyAPI.model.dto;

import lombok.Data;

@Data
public class ProgramReviewDto {
    Integer userId; Integer programId; Integer rating; String comment; 
}