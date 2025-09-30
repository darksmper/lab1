import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShopService {
    private List<Product> products;
    private List<Customer> customers;

    public ShopService() {
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    // Добавление продуктов и покупателей
    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Поиск товаров по категории
    public List<Product> findProductsByCategory(Category category) {
        return products.stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public List<Product> findProductsByCategoryName(String categoryName) {
        return products.stream()
                .filter(product -> product.getCategory().getName().equalsIgnoreCase(categoryName))
                .collect(Collectors.toList());
    }

    // Фильтрация покупателей по сумме покупок
    public List<Customer> filterCustomersByPurchaseAmount(double minAmount) {
        return customers.stream()
                .filter(customer -> customer.getTotalPurchaseAmount() >= minAmount)
                .collect(Collectors.toList());
    }

    public List<Customer> filterCustomersByPurchaseRange(double minAmount, double maxAmount) {
        return customers.stream()
                .filter(customer -> customer.getTotalPurchaseAmount() >= minAmount &&
                        customer.getTotalPurchaseAmount() <= maxAmount)
                .collect(Collectors.toList());
    }

    // Геттеры для списков
    public List<Product> getProducts() {
        return products;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}