class WaterBottle {
    String ownerName;
    int dailyTarget;

    WaterBottle(String ownerName, int dailyTarget) {
        this.ownerName = ownerName;
        this.dailyTarget = dailyTarget;
    }

    void displayBottleInfo() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Daily Target: " +
                           dailyTarget + " ml");
    }

    public static void main(String[] args) {
        WaterBottle b1 =
            new WaterBottle("Rahul", 3000);

        WaterBottle b2 =
            new WaterBottle("Priya", 2500);

        b1.displayBottleInfo();
        System.out.println();

        b2.displayBottleInfo();
    }
}