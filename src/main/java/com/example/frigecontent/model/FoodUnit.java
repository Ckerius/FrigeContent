package com.example.frigecontent.model;

// Указываем, что этот класс является сущностью, которая будет отображена на таблицу "food_units" в базе данных
@Data
@Entity
@Table(name = "food_units")
public class FoodUnit {

    @Id
    @GeneratedValue = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private LocalDate expirationDate;
    private boolean isInStock;
}
