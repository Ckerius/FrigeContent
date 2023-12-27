package com.example.frigecontent.repository;

import com.example.frigecontent.model.FoodUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Указываем, что это интерфейс репозитория для работы с сущностью FoodUnit
@Repository
public interface FoodUnitRepository extends JpaRepository<FoodUnit, Long> {

    Optional<FoodUnit> findById(Long id); // Поиск продукта/единицы пищи по идентификатору

    FoodUnit save(FoodUnit foodUnit);  // Сохранение продукта/единицы пищи

    FoodUnit saveAndFlush(FoodUnit foodUnit); // Сохранение продукта/единицы пищи и сброс изменений в базу данных

    void delete(FoodUnit foodUnit);  // Удаление продукта/единицы пищи
}
