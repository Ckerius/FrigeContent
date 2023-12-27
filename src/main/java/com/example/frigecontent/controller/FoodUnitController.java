package com.example.frigecontent.controller;

// Указываем, что этот класс является контроллером и будет обрабатывать запросы по пути "/foodUnits"

import com.example.frigecontent.dto.FoodUnitDTO;
import com.example.frigecontent.service.FoodUnitService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController("/food-units")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class FoodUnitController {

    FoodUnitService foodUnitService;

    // Метод для получения всех единиц пищи
    @GetMapping
    public List<FoodUnitDTO> getAllFoodUnits() {
        return foodUnitService.getAllFoodUnits();
    }

    // Метод для создания новой единицы пищи
    @PostMapping
    public FoodUnitDTO createFoodUnit(@RequestBody FoodUnitDTO foodUnitDTO) {
        return foodUnitService.createFoodUnit(foodUnitDTO);
    }
}

