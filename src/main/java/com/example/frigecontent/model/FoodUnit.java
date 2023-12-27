package com.example.frigecontent.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

// Указываем, что этот класс является сущностью, которая будет отображена на таблицу "food_units" в базе данных
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "food_units")
public class FoodUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private LocalDate expirationDate;
    private boolean isInStock;
}
