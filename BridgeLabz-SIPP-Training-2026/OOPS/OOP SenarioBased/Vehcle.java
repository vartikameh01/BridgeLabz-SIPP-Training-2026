class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber,
            String ownerName,
            String vehicleType) {

        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                System.out.println(v.vehicleNumber +
                        " - " + v.ownerName);
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                System.out.println(v.vehicleNumber +
                        " - " + v.ownerName);
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("UP01", "Rahul", "Car"),
            new Vehicle("UP02", "Aman", "Bike"),
            new Vehicle("UP03", "Priya", "Car"),
            new Vehicle("UP04", "Neha", "Bike"),
            new Vehicle("UP05", "Ravi", "Car"),
            new Vehicle("UP06", "Karan", "Bike"),
            new Vehicle("UP07", "Ankit", "Car"),
            new Vehicle("UP08", "Pooja", "Bike"),
            new Vehicle("UP09", "Rohan", "Car"),
            new Vehicle("UP10", "Simran", "Bike")
        };

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}