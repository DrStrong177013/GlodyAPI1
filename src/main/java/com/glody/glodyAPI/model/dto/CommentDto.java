package com.glody.glodyAPI.model.dto;

import lombok.Data;

@Data
public class CommentDto {
    Integer postId; Integer userId; String content; Integer parentCommentId; 
}