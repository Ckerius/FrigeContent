@RunWith(MockitoJUnitRunner.class)
public class ContainerServiceTest {

    @Mock
    private ContainerRepository containerRepository;

    @Mock
    private FoodUnitRepository foodUnitRepository;

    @InjectMocks
    private ContainerService containerService;

    @Test
    public void testGetAllContainers() {
        // Создание тестовых данных
        List<Container> containers = new ArrayList<>();
        containers.add(new Container("Container 1"));
        containers.add(new Container("Container 2"));

        Mockito.when(containerRepository.findAll()).thenReturn(containers);

        // Вызов метода сервиса
        List<Container> result = containerService.getAllContainers();

        // Проверка результата
        assertEquals(2, result.size());
    }

    @Test
    public void testCreateContainer() {
        // Создание тестового контейнера
        Container container = new Container("Test Container");

        Mockito.when(containerRepository.save(container)).thenReturn(container);

        // Вызов метода сервиса
        Container result = containerService.createContainer(container);

        // Проверка результата
        assertNotNull(result);
        assertEquals("Test Container", result.getName());
    }

}
