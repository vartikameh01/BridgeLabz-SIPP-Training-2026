class Vehicle {
    void fuelCost(int km) {
        System.out.println("Fuel Cost");
    }
}

class Car extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Car Cost = " + (km * 8));
    }
}

class Bus extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Bus Cost = " + (km * 15));
    }
}

class Bike extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Bike Cost = " + (km * 3));
    }
}

class ElectricCar extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Electric Car Charge = " + (km * 2));
    }
}
public class Main {
    public static void main(String[] args) {

        Vehicle[] v = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        for (Vehicle x : v) {
            if (x instanceof Car)
                ((Car) x).fuelCost(10);
            else if (x instanceof Bus)
                ((Bus) x).fuelCost(10);
            else if (x instanceof Bike)
                ((Bike) x).fuelCost(10);
            else if (x instanceof ElectricCar)
                ((ElectricCar) x).fuelCost(10);
        }
    }
}