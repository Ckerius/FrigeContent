package com.example.frigecontent.sevice;

@Data
@Service
public class ShoppingListService {

    private ShoppingListRepository shoppingListRepository;
    private FoodUnitRepository foodUnitRepository;

    @Autowired
    public ShoppingListService(ShoppingListRepository shoppingListRepository, FoodUnitRepository foodUnitRepository) {
        this.shoppingListRepository = shoppingListRepository;
        this.foodUnitRepository = foodUnitRepository;
    }

    public List<ShoppingList> getAllShoppingLists() {
        return shoppingListRepository.findAll();
    }

    public ShoppingList createShoppingList(ShoppingList shoppingList) {
        return shoppingListRepository.save(shoppingList);
    }

    public ShoppingList addProductToShoppingList(Long shoppingListId, Long foodUnitId) {
        ShoppingList shoppingList = shoppingListRepository.findById(shoppingListId).orElseThrow(() -> new EntityNotFoundException("ShoppingList not found"));
        FoodUnit foodUnit = foodUnitRepository.findById(foodUnitId).orElseThrow(() -> new EntityNotFoundException("FoodUnit not found"));

        shoppingList.getProducts().add(foodUnit);
        return shoppingListRepository.save(shoppingList);
    }

    // Другие методы для управления списками покупок

}
