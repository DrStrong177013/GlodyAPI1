package com.glody.glodyAPI.model.dto;

import lombok.Data;

@Data
public class MessageDto {
    Integer senderId; Integer receiverId; String content; 
}