@RunWith(SpringRunner.class)
@DataJpaTest
class FoodUnitRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private FoodUnitRepository foodUnitRepository;

    @Test
    void testFindByName() {
        // Подготовка данных
        FoodUnit apple = new FoodUnit("Apple");
        entityManager.persist(apple);
        entityManager.flush();

        // Вызов репозитория
        Optional<FoodUnit> found = foodUnitRepository.findByName("Apple");
        assertTrue(found.isPresent());
        assertEquals(apple.getName(), found.get().getName());
    }
}
