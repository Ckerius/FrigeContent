class FoodUnitMapperTest {

    private FoodUnitMapper foodUnitMapper = new FoodUnitMapper();

    @Test
    void testToDTO() {
        FoodUnit foodUnit = new FoodUnit(1L, "Apple");
        FoodUnitDTO foodUnitDTO = foodUnitMapper.toDTO(foodUnit);
        assertEquals(foodUnit.getId(), foodUnitDTO.getId());
        assertEquals(foodUnit.getName(), foodUnitDTO.getName());
    }

    @Test
    void testToEntity() {
        FoodUnitDTO foodUnitDTO = new FoodUnitDTO(1L, "Apple");
        FoodUnit foodUnit = foodUnitMapper.toEntity(foodUnitDTO);
        assertEquals(foodUnitDTO.getId(), foodUnit.getId());
        assertEquals(foodUnitDTO.getName(), foodUnit.getName());
    }
}
