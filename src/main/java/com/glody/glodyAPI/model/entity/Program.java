package com.glody.glodyAPI.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "programs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "university_id")
    private Integer universityId;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "degree_level_id")
    private Integer degreeLevelId;

    @Column(name = "tuition_fee", precision = 10, scale = 2)
    private BigDecimal tuitionFee;

    @Column(name = "tuition_currency_code", length = 3)
    private String tuitionCurrencyCode;

    @Column(name = "duration_years", precision = 3, scale = 1)
    private BigDecimal durationYears;

    @Column(name = "intake_months", columnDefinition = "TEXT")
    private String intakeMonths;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "application_deadline")
    private LocalDate applicationDeadline;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}