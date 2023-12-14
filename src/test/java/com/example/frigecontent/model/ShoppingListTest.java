@RunWith(MockitoJUnitRunner.class)
public class ShoppingListTest {

    @Test
    public void testShoppingListInitialization() {
        // Создание тестовых продуктов
        FoodUnit product1 = new FoodUnit("Product 1");
        FoodUnit product2 = new FoodUnit("Product 2");

        // Создание списка покупок с тестовыми данными
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.setProducts(Arrays.asList(product1, product2));

        // Проверка инициализации списка покупок
        assertEquals(2, shoppingList.getProducts().size());
    }

    @Test
    public void testAddProductToShoppingList() {
        // Создание тестовых продуктов и списка покупок
        FoodUnit product1 = new FoodUnit("Product 1");
        ShoppingList shoppingList = new ShoppingList(new ArrayList<>());

        // Добавление продукта в список покупок
        shoppingList.getProducts().add(product1);

        // Проверка добавления продукта
        assertEquals(1, shoppingList.getProducts().size());
    }

    // Другие тесты для класса ShoppingList

}
