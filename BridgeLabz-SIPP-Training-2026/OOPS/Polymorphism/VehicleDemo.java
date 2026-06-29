class Vehicle {
    String vehicleNumber, ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    int calculateToll() {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String n, String o) {
        super(n, o);
    }

    int calculateToll() {
        return 100;
    }
}

class Bus extends Vehicle {
    Bus(String n, String o) {
        super(n, o);
    }

    int calculateToll() {
        return 200;
    }
}

class Truck extends Vehicle {
    Truck(String n, String o) {
        super(n, o);
    }

    int calculateToll() {
        return 300;
    }
}

public class VehicleDemo {

    static void calculateTotalRevenue(Vehicle[] v) {
        int total = 0;
        for (Vehicle x : v)
            total += x.calculateToll();
        System.out.println("Total Revenue = " + total);
    }

    static void searchVehicle(Vehicle[] v, String num) {
        for (Vehicle x : v) {
            if (x.vehicleNumber.equals(num)) {
                System.out.println("Found: " + x.ownerName);
                return;
            }
        }
        System.out.println("Vehicle Not Found");
    }

    public static void main(String[] args) {

        Vehicle[] v = {
                new Car("C101", "Aman"),
                new Bus("B201", "Rahul"),
                new Truck("T301", "Priya"),
                new Car("C102", "Neha")
        };

        int car = 0, bus = 0, truck = 0;
        Vehicle max = v[0];

        for (Vehicle x : v) {
            System.out.println(x.vehicleNumber + " Toll = " + x.calculateToll());

            if (x.calculateToll() > max.calculateToll())
                max = x;

            if (x instanceof Car)
                car++;
            else if (x instanceof Bus)
                bus++;
            else
                truck++;
        }

        calculateTotalRevenue(v);
        searchVehicle(v, "T301");

        System.out.println("Highest Toll = " + max.vehicleNumber);
        System.out.println("Cars = " + car);
        System.out.println("Buses = " + bus);
        System.out.println("Trucks = " + truck);
    }
}