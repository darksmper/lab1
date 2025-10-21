import model.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Category electronics = new Category("Электроника");
        Category clothing = new Category("Одежда");
        Category books = new Category("Книги");

        List<Product> products = Arrays.asList(
                new Product("Смартфон", electronics, 25000),
                new Product("Наушники", electronics, 3000),
                new Product("Футболка", clothing, 1500),
                new Product("Роман", books, 700)
        );

        List<Customer> customers = Arrays.asList(
                new Customer("Иванов", 12000),
                new Customer("Петров", 4000),
                new Customer("Сидоров", 26000)
        );

        // Поиск товаров по категории
        String searchCategory = "Электроника";
        System.out.println("Товары в категории: " + searchCategory);
        products.stream()
                .filter(p -> p.getCategory().getName().equalsIgnoreCase(searchCategory))
                .forEach(System.out::println);

        // Фильтрация покупателей по сумме покупок
        double minSpent = 10000;
        System.out.println("\nПокупатели с суммой покупок > " + minSpent + ":");
        customers.stream()
                .filter(c -> c.getTotalSpent() > minSpent)
                .forEach(System.out::println);
    }
}
