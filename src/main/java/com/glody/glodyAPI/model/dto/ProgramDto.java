package com.glody.glodyAPI.model.dto;

import lombok.Data;

@Data
public class ProgramDto {
    String name; Integer universityId; Integer countryId; Integer degreeLevelId; String tuitionCurrencyCode; String intakeMonths; String description; 
}