/*
Этот файл содержит интерфейс для взаимодействия с базой данных для сущности "Product".
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Методы для чтения продукта по идентификатору
    Optional<Product> findById(Long id);

    // Метод для сохранения нового продукта
    Product save(Product product);

    // Метод для обновления продукта
    Product saveAndFlush(Product product);

    // Метод для удаления продукта
    void delete(Product product);

    // Другие методы, если необходимо
}