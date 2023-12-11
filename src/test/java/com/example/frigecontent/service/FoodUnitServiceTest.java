@SpringBootTest
class FoodUnitServiceTest {

    @Autowired
    private FoodUnitService foodUnitService;

    @MockBean
    private FoodUnitRepository foodUnitRepository;

    @Autowired
    private FoodUnitMapper foodUnitMapper;

    @Test
    void testGetAllFoodUnits() {
        // Подготовка тестовых данных
        List<FoodUnit> foodUnits = Arrays.asList(new FoodUnit(1L, "Apple"), new FoodUnit(2L, "Banana"));

        // Определение поведения репозитория
        given(foodUnitRepository.findAll()).willReturn(foodUnits);

        // Вызов сервисного метода
        List<FoodUnitDTO> result = foodUnitService.getAllFoodUnits();

        // Проверка результата
        assertEquals(foodUnitMapper.toDTO(foodUnits), result);
    }

    @Test
    void testCreateFoodUnit() {
        // Подготовка тестовых данных
        FoodUnitDTO foodUnitDTO = new FoodUnitDTO(null, "Orange");
        FoodUnit foodUnit = new FoodUnit(3L, "Orange");

        // Определение поведения репозитория
        given(foodUnitRepository.save(any(FoodUnit.class))).willReturn(foodUnit);

        // Вызов сервисного метода
        FoodUnitDTO result = foodUnitService.createFoodUnit(foodUnitDTO);

        // Проверка результата
        assertEquals(foodUnitMapper.toDTO(foodUnit), result);
    }
}
