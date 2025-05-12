package com.glody.glodyAPI.model.dto;

import lombok.Data;

@Data
public class UniversityHistoryDto {
    Integer universityId; String fieldName; String oldValue; String newValue; 
}