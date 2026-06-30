public class Main {
    public static void main(String[] args) {
        VegItem veg = new VegItem("Paneer Tikka", 200, 2);
        NonVegItem nonVeg = new NonVegItem("Chicken Biryani", 300, 2, 50);
        System.out.println("----- Veg Item -----");
        veg.displayItemDetails();
        System.out.println("Total Price : " + veg.calculateTotalPrice());
        System.out.println();
        System.out.println("----- Non-Veg Item -----");
        nonVeg.displayItemDetails();
        System.out.println("Service Charge : " + nonVeg.getServiceCharge());
        System.out.println("Total Price : " + nonVeg.calculateTotalPrice());
    }
}