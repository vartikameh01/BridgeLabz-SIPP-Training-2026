interface FoodDelivery {
    void deliverFood();

    default void trackOrder() {
        System.out.println("Tracking Food Order");
    }

    static String generateDeliveryCode() {
        return "FD101";
    }
}

interface GroceryDelivery {
    void deliverGroceries();

    default void trackOrder() {
        System.out.println("Tracking Grocery Order");
    }
}

class DeliveryExecutive
        implements FoodDelivery, GroceryDelivery {

    public void deliverFood() {
        System.out.println("Food Delivered");
    }

    public void deliverGroceries() {
        System.out.println("Groceries Delivered");
    }

    public void trackOrder() {
        System.out.println("Order Tracking Enabled");
    }
}

public class DeliveryDemo {
    public static void main(String[] args) {

        String[] customers = {"Ankit", "Pooja", "Rohan"};

        DeliveryExecutive d = new DeliveryExecutive();

        for (String customer : customers) {
            System.out.println("\nCustomer: " + customer);
            System.out.println("Code: " +
                    FoodDelivery.generateDeliveryCode());

            d.trackOrder();
            d.deliverFood();
            d.deliverGroceries();
        }
    }
}