package com.glody.glodyAPI.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "profiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "full_name", length = 100, nullable = false)
    private String fullName;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "gender", length = 20)
    private String gender;

    @Column(name = "gpa", precision = 4, scale = 2)
    private BigDecimal gpa;

    @Column(name = "budget", precision = 12, scale = 2)
    private BigDecimal budget;

    @Column(name = "currency_code", length = 3)
    private String currencyCode;

    @Column(name = "language_scores", columnDefinition = "TEXT")
    private String languageScores;

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "avatar_file_id")
    private Integer avatarFileId;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}