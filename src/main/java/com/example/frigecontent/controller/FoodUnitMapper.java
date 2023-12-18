package com.example.frigecontent.controller;
@Mapper
public interface FoodUnitMapper {

    FoodUnitMapper INSTANCE = Mappers.getMapper(FoodUnitMapper.class);

    FoodUnitDTO toDTO(FoodUnit foodUnit);

    FoodUnit toEntity(FoodUnitDTO foodUnitDTO);
}
