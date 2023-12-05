/*
В этом файле вы опишете модель продукта. Укажите необходимые поля, конструкторы, геттеры и сеттеры.
 */

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;

    private LocalDate expirationDate;

    // Дополнительные поля и методы модели
}