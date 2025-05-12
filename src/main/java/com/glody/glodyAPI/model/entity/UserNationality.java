package com.glody.glodyAPI.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_nationalities")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(UserNationalityId.class)
public class UserNationality {

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Id
    @Column(name = "country_id")
    private Integer countryId;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}