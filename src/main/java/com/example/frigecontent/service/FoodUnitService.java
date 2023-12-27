package com.example.frigecontent.service;

import com.example.frigecontent.controller.FoodUnitMapper;
import com.example.frigecontent.dto.FoodUnitDTO;
import com.example.frigecontent.model.FoodUnit;
import com.example.frigecontent.repository.FoodUnitRepository;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class FoodUnitService {

    private FoodUnitMapper foodUnitMapper;
    private FoodUnitRepository foodUnitRepository;

    // Метод для получения всех единиц пищи
    public List<FoodUnitDTO> getAllFoodUnits() {
        List<FoodUnit> foodUnits = foodUnitRepository.findAll(); // Получение списка всех единиц пищи из репозитория
        return foodUnitMapper.toDTO(foodUnits); // использование маппера для преобразования в DTO

    }

    // Метод для создания новой единицы пищи
    public FoodUnitDTO createFoodUnit(FoodUnitDTO foodUnitDTO) {
        FoodUnit newFoodUnit = foodUnitMapper.toEntity(foodUnitDTO); // Преобразование DTO в сущность и сохранение в репозитории

        return foodUnitMapper.toDTO(foodUnitRepository.save(newFoodUnit)); // использование маппера для преобразования результата в DTO
    }
}
