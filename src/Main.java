import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание сервиса магазина
        ShopService shopService = new ShopService();

        // Создание категорий
        Category electronics = new Category(1, "Electronics");
        Category books = new Category(2, "Books");
        Category clothing = new Category(3, "Clothing");

        // Добавление товаров
        shopService.addProduct(new Product(1, "Laptop", 999.99, electronics));
        shopService.addProduct(new Product(2, "Smartphone", 499.99, electronics));
        shopService.addProduct(new Product(3, "Java Programming", 49.99, books));
        shopService.addProduct(new Product(4, "T-Shirt", 19.99, clothing));
        shopService.addProduct(new Product(5, "Tablet", 299.99, electronics));

        // Добавление покупателей
        shopService.addCustomer(new Customer(1, "John Doe", "john@email.com", 1250.50));
        shopService.addCustomer(new Customer(2, "Jane Smith", "jane@email.com", 350.75));
        shopService.addCustomer(new Customer(3, "Bob Johnson", "bob@email.com", 2800.00));
        shopService.addCustomer(new Customer(4, "Alice Brown", "alice@email.com", 150.00));

        // Демонстрация поиска товаров по категории
        System.out.println("=== Товары в категории 'Electronics' ===");
        List<Product> electronicsProducts = shopService.findProductsByCategoryName("Electronics");
        for (Product product : electronicsProducts) {
            System.out.println(product);
        }

        System.out.println("\n=== Товары в категории 'Books' ===");
        List<Product> booksProducts = shopService.findProductsByCategory(books);
        for (Product product : booksProducts) {
            System.out.println(product);
        }

        // Демонстрация фильтрации покупателей по сумме покупок
        System.out.println("\n=== Покупатели с суммой покупок >= 1000 ===");
        List<Customer> vipCustomers = shopService.filterCustomersByPurchaseAmount(1000.0);
        for (Customer customer : vipCustomers) {
            System.out.println(customer);
        }

        System.out.println("\n=== Покупатели с суммой покупок от 200 до 1000 ===");
        List<Customer> mediumCustomers = shopService.filterCustomersByPurchaseRange(200.0, 1000.0);
        for (Customer customer : mediumCustomers) {
            System.out.println(customer);
        }

        // Дополнительная информация
        System.out.println("\n=== Общая информация ===");
        System.out.println("Всего товаров: " + shopService.getProducts().size());
        System.out.println("Всего покупателей: " + shopService.getCustomers().size());
    }
}