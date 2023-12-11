/*
Здесь вы создадите бизнес-логику для управления продуктами.
 */

// Указываем, что этот класс является сервисом
@Data
@Service
public class FoodUnitService {

    private FoodUnitRepository foodUnitRepository;
    private FoodUnitMapper foodUnitMapper;

    // Конструктор сервиса, который принимает репозиторий в качестве зависимости
    public FoodUnitService(FoodUnitRepository foodUnitRepository, FoodUnitMapper foodUnitMapper) {
        this.foodUnitRepository = foodUnitRepository;
        this.foodUnitMapper = foodUnitMapper;
    }

    // Метод для получения всех единиц пищи
    public List<FoodUnitDTO> getAllFoodUnits() {
        List<FoodUnit> foodUnits = foodUnitRepository.findAll(); // Получение списка всех единиц пищи из репозитория
        return foodUnitMapper.toDTO(foodUnits); // использование маппера для преобразования в DTO

    }

    // Метод для создания новой единицы пищи
    public FoodUnitDTO createFoodUnit(FoodUnitDTO foodUnitDTO) {
        FoodUnit newFoodUnit = foodUnitMapper.toEntity(foodUnitDTO); // Преобразование DTO в сущность и сохранение в репозитории
        FoodUnit savedFoodUnit = foodUnitRepository.save(newFoodUnit);

        return foodUnitMapper.toDTO(savedFoodUnit); // использование маппера для преобразования результата в DTO
    }
}