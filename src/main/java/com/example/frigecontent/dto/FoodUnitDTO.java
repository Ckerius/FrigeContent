package com.example.frigecontent.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodUnitDTO {

    private Long id;
    private String name;
    private String category;
    private LocalDate expirationDate;
    private boolean isInStock;

}
