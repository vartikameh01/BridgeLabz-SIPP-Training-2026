import java.util.*;
class TrafficSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> traffic = new HashMap<>();
        traffic.put("MG Road", 120);
        traffic.put("Station Road", 250);
        traffic.put("Ring Road", 180);

        TreeMap<String, Integer> sorted = new TreeMap<>(traffic);

        System.out.println("Traffic Report");

        for (String road : sorted.keySet()) {
            System.out.println(road + " : " + sorted.get(road));
        }

        String busyRoad = "";
        int max = 0;

        for (String road : traffic.keySet()) {
            if (traffic.get(road) > max) {
                max = traffic.get(road);
                busyRoad = road;
            }
        }
        System.out.println("\nBusiest Road : " + busyRoad);
        System.out.println("Vehicles : " + max);
        System.out.println("Total Roads = " + traffic.size());
    }
}