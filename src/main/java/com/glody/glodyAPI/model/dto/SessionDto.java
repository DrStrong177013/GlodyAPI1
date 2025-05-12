package com.glody.glodyAPI.model.dto;

import lombok.Data;

@Data
public class SessionDto {
    Integer userId; String refreshTokenHash; 
}