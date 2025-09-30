public class Customer {
    private int id;
    private String name;
    private String email;
    private double totalPurchaseAmount; // Общая сумма покупок

    public Customer(int id, String name, String email, double totalPurchaseAmount) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.totalPurchaseAmount = totalPurchaseAmount;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public void setTotalPurchaseAmount(double totalPurchaseAmount) {
        this.totalPurchaseAmount = totalPurchaseAmount;
    }

    public void addPurchase(double amount) {
        this.totalPurchaseAmount += amount;
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "', email='" + email +
                "', totalPurchaseAmount=" + totalPurchaseAmount + "}";
    }
}