package com.glody.glodyAPI.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment_likes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CommentLikeId.class)
public class CommentLike {

    @Id
    @Column(name = "comment_id")
    private Integer commentId;

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}