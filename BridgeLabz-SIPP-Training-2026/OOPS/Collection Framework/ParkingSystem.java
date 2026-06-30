import java.util.*;
class ParkingSystem {
    public static void main(String[] args) {

        ArrayList<String> parking = new ArrayList<>();

        parking.add("UP32AB1234");
        parking.add("DL01CD5678");
        parking.add("MH12XY1111");

        parking.remove("DL01CD5678");

        String vehicle = "UP32AB1234";

        if (parking.contains(vehicle))
            System.out.println("Vehicle Found");
        else
            System.out.println("Vehicle Not Found");

        System.out.println("\nParked Vehicles");
        for (String v : parking)
            System.out.println(v);

        System.out.println("Total Slots = " + parking.size());
    }
}