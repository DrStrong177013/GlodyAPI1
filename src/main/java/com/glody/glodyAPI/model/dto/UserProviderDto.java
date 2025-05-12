package com.glody.glodyAPI.model.dto;

import lombok.Data;

@Data
public class UserProviderDto {
    Integer userId; String provider; String providerUserId; String accessToken; 
}