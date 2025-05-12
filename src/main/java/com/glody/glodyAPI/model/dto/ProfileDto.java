package com.glody.glodyAPI.model.dto;

import lombok.Data;

@Data
public class ProfileDto {
    Integer userId; String fullName; String gender; String address; String phone; String currencyCode; String languageScores; 
}