package com.example.frigecontent.dto;
@Data
public class FoodUnitDTO {

    private Long id;
    private String name;
    private String category;
    private LocalDate expirationDate;
    private boolean isInStock;

}
