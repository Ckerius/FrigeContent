class FoodUnitDTOTest {

    @Test
    void testFoodUnitDTOEqualsAndHashCode() {
        FoodUnitDTO unit1 = new FoodUnitDTO(1L, "Apple");
        FoodUnitDTO unit2 = new FoodUnitDTO(1L, "Apple");
        assertEquals(unit1, unit2);
        assertEquals(unit1.hashCode(), unit2.hashCode());
    }

    @Test
    void testFoodUnitDTOToString() {
        FoodUnitDTO unit = new FoodUnitDTO(1L, "Apple");
        assertEquals("FoodUnitDTO{id=1, name='Apple'}", unit.toString());
    }
}
