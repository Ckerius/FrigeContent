package com.example.frigecontent.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Objects;

// Указываем, что этот класс является сущностью, которая будет отображена на таблицу "food_units" в базе данных
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "food_units")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FoodUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String category;
    boolean isInStock;
    LocalDate expirationDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodUnit foodUnit)) return false;
        return isInStock == foodUnit.isInStock && Objects.equals(id, foodUnit.id) && Objects.equals(name, foodUnit.name) && Objects.equals(category, foodUnit.category) && Objects.equals(expirationDate, foodUnit.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, isInStock, expirationDate);
    }
}
