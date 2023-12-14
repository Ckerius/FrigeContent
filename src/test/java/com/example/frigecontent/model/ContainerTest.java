@RunWith(MockitoJUnitRunner.class)
public class ContainerTest {

    @Test
    public void testContainerInitialization() {
        // Создание тестовых продуктов
        FoodUnit product1 = new FoodUnit("Product 1");
        FoodUnit product2 = new FoodUnit("Product 2");

        // Создание контейнера с тестовыми данными
        Container container = new Container();
        container.setCategory("Test Category");
        container.setProducts(Arrays.asList(product1, product2));

        // Проверка инициализации контейнера
        assertEquals("Test Category", container.getCategory());
        assertEquals(2, container.getProducts().size());
    }

    @Test
    public void testAddProductToContainer() {
        // Создание тестовых продуктов и контейнера
        FoodUnit product1 = new FoodUnit("Product 1");
        Container container = new Container("Test Container", new ArrayList<>());

        // Добавление продукта в контейнер
        container.getProducts().add(product1);

        // Проверка добавления продукта
        assertEquals(1, container.getProducts().size());
    }

    // Другие тесты для класса Container

}
