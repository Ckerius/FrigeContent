package com.example.frigecontent.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FoodUnitDTO {

    Long id;
    String name;
    String category;
    boolean isInStock;
    LocalDate expirationDate;

}
