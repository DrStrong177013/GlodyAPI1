package com.glody.glodyAPI.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "post_likes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(PostLikeId.class)
public class PostLike {

    @Id
    @Column(name = "post_id")
    private Integer postId;

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}