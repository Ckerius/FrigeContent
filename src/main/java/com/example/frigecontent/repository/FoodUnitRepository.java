package com.example.frigecontent.repository;

import com.example.frigecontent.model.FoodUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// Указываем, что это интерфейс репозитория для работы с сущностью FoodUnit
@Repository
public interface FoodUnitRepository extends JpaRepository<FoodUnit, Long> {
}
