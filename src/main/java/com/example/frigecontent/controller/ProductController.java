/*
Этот файл содержит код для обработки веб-запросов, связанных с продуктами.
Вы можете добавить методы для создания, чтения, обновления и удаления продуктов,
а также другие операции, связанные с управлением продуктами.
 */

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    // Constructor injection for ProductService
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Add request mapping methods for product operations
}
