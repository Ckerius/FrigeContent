package com.example.frigecontent.controller;

import com.example.frigecontent.dto.FoodUnitDTO;
import com.example.frigecontent.model.FoodUnit;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FoodUnitMapper {

    FoodUnitDTO toDTO(FoodUnit foodUnit);

    FoodUnit toEntity(FoodUnitDTO foodUnitDTO);

    List<FoodUnitDTO> toDTO(List<FoodUnit> foodUnits);
}
