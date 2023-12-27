package com.example.frigecontent.sevice;

import com.example.frigecontent.model.FoodUnit;
import com.example.frigecontent.model.ShoppingList;
import com.example.frigecontent.repository.FoodUnitRepository;
import com.example.frigecontent.repository.ShoppingListRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ShoppingListService {

    FoodUnitRepository foodUnitRepository;
    ShoppingListRepository shoppingListRepository;

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
