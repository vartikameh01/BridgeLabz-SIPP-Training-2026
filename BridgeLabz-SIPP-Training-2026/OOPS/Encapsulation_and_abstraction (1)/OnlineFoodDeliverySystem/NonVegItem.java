public class NonVegItem extends FoodItem {
    private double serviceCharge;
    public NonVegItem(String itemName, double price, int quantity, double serviceCharge) {
        super(itemName, price, quantity);
        this.serviceCharge = serviceCharge;
    }
    public double getServiceCharge() {
        return serviceCharge;
    }
    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + serviceCharge;
    }
}