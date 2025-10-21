package model;

public class Customer {
    private String name;
    private double totalSpent;

    public Customer(String name, double totalSpent) {
        this.name = name;
        this.totalSpent = totalSpent;
    }

    public String getName() { return name; }
    public double getTotalSpent() { return totalSpent; }

    @Override
    public String toString() {
        return String.format("%s (сумма покупок: %.2f руб)", name, totalSpent);
    }
}
