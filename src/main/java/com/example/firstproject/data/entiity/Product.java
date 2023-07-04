package com.example.firstproject.data.entiity;


import lombok.Getter;
import lombok.Setter;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

// 예제 7.2
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "name")
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public void setUpdateAt(LocalDateTime now) {
    }
}