class Drone {
    int droneId;
    int batteryPercentage;

    static String companyName = "SkyDeliver";

    Drone(int droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        System.out.println("Drone " + droneId +
                " started delivery.");
    }

    void displayStatus() {
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery: " +
                batteryPercentage + "%");
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        Drone d1 = new Drone(1, 90);
        Drone d2 = new Drone(2, 80);
        Drone d3 = new Drone(3, 70);

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}