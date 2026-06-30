import java.util.*;
class Astronaut {
    int id;
    String name;
    String specialization;

    Astronaut(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }
}
class SpaceMission {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Astronaut>> mission = new HashMap<>();
        HashSet<String> ids = new HashSet<>();

        mission.put("Moon Mission", new ArrayList<>());

        Astronaut a1 = new Astronaut(1, "Rahul", "Pilot");
        Astronaut a2 = new Astronaut(2, "Aman", "Engineer");

        if (ids.add("Moon Mission1"))
            mission.get("Moon Mission").add(a1);

        if (ids.add("Moon Mission2"))
            mission.get("Moon Mission").add(a2);

        if (!ids.add("Moon Mission1"))
            System.out.println("Duplicate Astronaut");

        for (String m : mission.keySet()) {

            System.out.println("\nMission : " + m);

            for (Astronaut a : mission.get(m)) {
                System.out.println(a.id + " " + a.name + " " + a.specialization);
            }

            System.out.println("Total Crew = " + mission.get(m).size());
        }
    }
}