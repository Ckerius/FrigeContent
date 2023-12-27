package com.example.frigecontent.controller;

import com.example.frigecontent.dto.FoodUnitDTO;
import com.example.frigecontent.model.FoodUnit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FoodUnitMapperTest {

    @Autowired
    private FoodUnitMapper foodUnitMapper;

    @Test
    void testToDTO() {
        FoodUnit foodUnit = new FoodUnit(1L, "Apple", "Fruits", LocalDate.now(), true);
        FoodUnitDTO foodUnitDTO = foodUnitMapper.toDTO(foodUnit);
        assertEquals(foodUnit.getId(), foodUnitDTO.getId());
        assertEquals(foodUnit.getName(), foodUnitDTO.getName());
    }

    @Test
    void testToEntity() {
        FoodUnitDTO foodUnitDTO = new FoodUnitDTO(1L, "Apple", "Fruits", LocalDate.now(), true);
        FoodUnit foodUnit = foodUnitMapper.toEntity(foodUnitDTO);
        assertEquals(foodUnitDTO.getId(), foodUnit.getId());
        assertEquals(foodUnitDTO.getName(), foodUnit.getName());
    }
}
