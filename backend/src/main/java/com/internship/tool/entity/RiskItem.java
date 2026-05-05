package com.internship.tool.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "risk_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RiskItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 2000)
    private String description;

    private String category;

    private String status; // OPEN, IN_PROGRESS, CLOSED

    private Integer riskScore; // 1–100

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}