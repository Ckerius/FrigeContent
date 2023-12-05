/*
Здесь вы создадите бизнес-логику для управления продуктами.
 */

@Service
public class ProductService {

    private ProductRepository productRepository;

    // Constructor injection for ProductRepository
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Добавьте методы для управления продуктами
}