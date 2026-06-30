public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setVehicleNumber("MP04AB1234");
        car.setVehicleType("Car");
        car.setDailyRate(1500);
        Bike bike = new Bike();
        bike.setVehicleNumber("MP04XY5678");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);
        Truck truck = new Truck();
        truck.setVehicleNumber("MP09TR9999");
        truck.setVehicleType("Truck");
        truck.setDailyRate(3000);
        truck.setLoadingCharge(2000);

        int days = 5;

        System.out.println("----- Car -----");
        car.displayVehicleInfo();
        System.out.println("Rental Cost: ₹" + car.calculateRentalCost(days));

        System.out.println();

        System.out.println("----- Bike -----");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost: ₹" + bike.calculateRentalCost(days));

        System.out.println();

        System.out.println("----- Truck -----");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost: ₹" + truck.calculateRentalCost(days));
    }
}