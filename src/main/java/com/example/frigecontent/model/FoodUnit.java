/*
В этом файле вы опишете модель продукта. Укажите необходимые поля, конструкторы, геттеры и сеттеры.
 */

// Указываем, что этот класс является сущностью, которая будет отображена на таблицу "food_units" в базе данных
@Data
@Entity
@Table(name = "food_units")
public class FoodUnit {

    @Id // Указываем, что это поле является идентификатором сущности
    @GeneratedValue = GenerationType.IDENTITY) // Генерация значения идентификатора сущности
    private Long id;

    private String name; // Имя продукта/единицы пищи

    private String category; // Категория продукта/единицы пищи

    private LocalDate expirationDate; // Дата окончания срока годности продукта/единицы пищи

    private boolean isInStock; // В наличии ли продукт

}
