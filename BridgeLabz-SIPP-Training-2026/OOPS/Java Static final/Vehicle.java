class Vehicle {
    static double registrationFee = 500;

    final int registrationNumber;
    String ownerName, vehicleType;

    Vehicle(int reg, String owner, String type) {
        this.registrationNumber = reg;
        this.ownerName = owner;
        this.vehicleType = type;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display() {
        if (this instanceof Vehicle) {
            System.out.println(ownerName + " " + vehicleType + " " + registrationNumber);
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle(111, "Amit", "Bike");
        v.display();
        Vehicle.updateRegistrationFee(800);
    }
}