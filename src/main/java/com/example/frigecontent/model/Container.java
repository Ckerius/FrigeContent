@Data
@Entity
@Table(name = "containers")
public class Container {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;

    @OneToMany(cascade = CascadeType.ALL)
    private List<FoodUnit> products;

    @ElementCollection
    private List<FoodUnit> expiringProducts;

    @ElementCollection
    private List<FoodUnit> expiredProducts;

    @ElementCollection
    private List<FoodUnit> previousProducts;

}
