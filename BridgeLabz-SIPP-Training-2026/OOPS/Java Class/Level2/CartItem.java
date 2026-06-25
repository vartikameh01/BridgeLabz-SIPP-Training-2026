class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String n, double p, int q) {
        itemName = n;
        price = p;
        quantity = q;
    }

    void add(int q) {
        quantity += q;
    }

    void remove(int q) {
        quantity -= q;
    }

    void displayTotal() {
        System.out.println("Total Cost = " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Book", 200, 2);
        c.add(1);
        c.displayTotal();
    }
}