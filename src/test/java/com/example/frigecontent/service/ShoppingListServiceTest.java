@RunWith(MockitoJUnitRunner.class)
public class ShoppingListServiceTest {

    @Mock
    private ShoppingListRepository shoppingListRepository;

    @Mock
    private FoodUnitRepository foodUnitRepository;

    @InjectMocks
    private ShoppingListService shoppingListService;

    @Test
    public void testGetAllShoppingLists() {
        // Создание тестовых данных
        List<ShoppingList> shoppingLists = new ArrayList<>();
        shoppingLists.add(new ShoppingList("Shopping List 1", new ArrayList<>()));
        shoppingLists.add(new ShoppingList("Shopping List 2", new ArrayList<>()));

        Mockito.when(shoppingListRepository.findAll()).thenReturn(shoppingLists);

        // Вызов метода сервиса
        List<ShoppingList> result = shoppingListService.getAllShoppingLists();

        // Проверка результата
        assertEquals(2, result.size());
    }

    @Test
    public void testCreateShoppingList() {
        // Создание тестового списка покупок
        ShoppingList shoppingList = new ShoppingList("Test Shopping List", new ArrayList<>());

        Mockito.when(shoppingListRepository.save(shoppingList)).thenReturn(shoppingList);

        // Вызов метода сервиса
        ShoppingList result = shoppingListService.createShoppingList(shoppingList);

        // Проверка результата
        assertNotNull(result);
        assertEquals("Test Shopping List", result.getName());
    }

    // Другие тесты для методов ShoppingListService

}
