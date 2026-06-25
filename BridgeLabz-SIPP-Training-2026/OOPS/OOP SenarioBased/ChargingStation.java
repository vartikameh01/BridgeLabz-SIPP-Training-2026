class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.0;

    int stationId;
    double unitsConsumed;

    ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units: " + unitsConsumed);
        System.out.println("Bill: " + calculateBill());
    }

    public static void main(String[] args) {

        ChargingStation[] stations = {
                new ChargingStation(1, 100),
                new ChargingStation(2, 120),
                new ChargingStation(3, 90),
                new ChargingStation(4, 150),
                new ChargingStation(5, 80)
        };

        electricityRate = 10.0;

        for (ChargingStation s : stations) {
            s.displayStationDetails();
        }

        System.out.println("Total Stations: " +
                totalStations);
    }
}