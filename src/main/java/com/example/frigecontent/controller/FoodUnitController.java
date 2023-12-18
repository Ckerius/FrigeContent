package com.example.frigecontent.controller;

// Указываем, что этот класс является контроллером и будет обрабатывать запросы по пути "/foodUnits"

@RestController
@RequestMapping("/foodUnits")
public class FoodUnitController {

    private FoodUnitService foodUnitService;
    private FoodUnitMapper foodUnitMapper;

    // Конструктор контроллера, который принимает сервис в качестве зависимости
    public FoodUnitController(FoodUnitService foodUnitService, FoodUnitMapper foodUnitMapper) {
        this.foodUnitService = foodUnitService;
        this.foodUnitMapper = foodUnitMapper;
    }

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

