package com.example.frigecontent.service;

import com.example.frigecontent.model.Container;
import com.example.frigecontent.model.FoodUnit;
import com.example.frigecontent.repository.ContainerRepository;
import com.example.frigecontent.repository.FoodUnitRepository;
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
public class ContainerService {

    FoodUnitRepository foodUnitRepository;
    ContainerRepository containerRepository;

    public List<Container> getAllContainers() {
        return containerRepository.findAll();
    }

    public Container createContainer(Container container) {
        return containerRepository.save(container);
    }

    public Container addProductToContainer(Long containerId, Long foodUnitId) {
        Container container = containerRepository.findById(containerId).orElseThrow(() -> new EntityNotFoundException("Container not found"));
        FoodUnit foodUnit = foodUnitRepository.findById(foodUnitId).orElseThrow(() -> new EntityNotFoundException("FoodUnit not found"));

        container.getProducts().add(foodUnit);
        return containerRepository.save(container);
    }

    // Другие методы для управления контейнерами

}
