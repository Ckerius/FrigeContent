package com.example.frigecontent.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "containers")
public class Container {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;

    @OneToMany(cascade = CascadeType.ALL)
    private List<FoodUnit> products;

//    @ElementCollection
//    private List<FoodUnit> expiringProducts;
//
//    @ElementCollection
//    private List<FoodUnit> expiredProducts;
//
//    @ElementCollection
//    private List<FoodUnit> previousProducts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Container container)) return false;
        return Objects.equals(id, container.id) && Objects.equals(category, container.category) && Objects.equals(products, container.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, products);
    }
}
