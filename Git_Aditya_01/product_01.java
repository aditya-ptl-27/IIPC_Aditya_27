package java_demo;

class Product {
    private String name;
    private double price;
    private int quantity;
    private static int totalSold;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            totalSold += quantity;
            System.out.println(quantity + " " + name + " sold ");
        } else {
            System.out.println("Insufficient quantity of " + name + " available to sell.");
        }
    }

    public static int getTotalSold() {
        return totalSold;
    }
}

public class product_01 {
    public static void main(String[] args) {
        Product product1 = new Product("Book", 19.99, 50);
        Product product2 = new Product("Pen", 2.99, 100);
        Product product3 = new Product("Shirt", 29.99, 20);

        product1.sell(10);
        product2.sell(50);
        product3.sell(15);

        System.out.println("Total quantity of products sold: " + Product.getTotalSold());
    }
}
