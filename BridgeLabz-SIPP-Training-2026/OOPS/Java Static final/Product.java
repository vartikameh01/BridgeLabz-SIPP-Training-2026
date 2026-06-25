class Product {
    static double discount = 10;

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int id, String name, double price, int qty) {
        this.productID = id;
        this.productName = name;
        this.price = price;
        this.quantity = qty;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void display() {
        if (this instanceof Product) {
            double total = price * quantity;
            System.out.println(productName + " Total = " + (total - total * discount / 100));
        }
    }

    public static void main(String[] args) {
        Product p = new Product(101, "Pen", 20, 5);
        p.display();
        Product.updateDiscount(20);
        p.display();
    }
}