package com.example.frigecontent.controller;

@WebMvcTest(FoodUnitController.class)
class FoodUnitControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FoodUnitService foodUnitService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void getAllFoodUnits() throws Exception {
        // Подготовка тестовых данных
        List<FoodUnitDTO> foodUnitDTOs = Arrays.asList(new FoodUnitDTO(1L, "Apple"), new FoodUnitDTO(2L, "Banana"));

        // Определение поведения сервиса
        given(foodUnitService.getAllFoodUnits()).willReturn(foodUnitDTOs);

        // Выполнение запроса и проверка результата
        mockMvc.perform(get("/foodUnits"))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(foodUnitDTOs)));
    }

    @Test
    void createFoodUnit() throws Exception {
        // Подготовка тестовых данных
        FoodUnitDTO foodUnitDTO = new FoodUnitDTO(null, "Orange");
        FoodUnitDTO createdFoodUnitDTO = new FoodUnitDTO(3L, "Orange");

        // Определение поведения сервиса
        given(foodUnitService.createFoodUnit(foodUnitDTO)).willReturn(createdFoodUnitDTO);

        // Выполнение запроса и проверка результата
        mockMvc.perform(post("/foodUnits")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(foodUnitDTO)))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(createdFoodUnitDTO)));
    }
}
