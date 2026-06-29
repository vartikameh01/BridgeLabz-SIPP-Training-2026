class RescueTeam {
    String teamId, location;

    RescueTeam(String teamId, String location) {
        this.teamId = teamId;
        this.location = location;
    }

    void performDuty() {
        System.out.println("Working");
    }
}

class MedicalTeam extends RescueTeam {
    MedicalTeam(String id, String l) {
        super(id, l);
    }

    void performDuty() {
        System.out.println(teamId + " gives medical help");
    }
}

class FireRescueTeam extends RescueTeam {
    FireRescueTeam(String id, String l) {
        super(id, l);
    }

    void performDuty() {
        System.out.println(teamId + " controls fire");
    }
}

class FoodSupplyTeam extends RescueTeam {
    FoodSupplyTeam(String id, String l) {
        super(id, l);
    }

    void performDuty() {
        System.out.println(teamId + " supplies food");
    }
}

public class RescueDemo {

    static void findTeamByLocation(RescueTeam[] t, String loc) {
        for (RescueTeam x : t)
            if (x.location.equals(loc))
                System.out.println("Found Team: " + x.teamId);
    }

    static void displayTeamsByPrefix(RescueTeam[] t, String p) {
        for (RescueTeam x : t)
            if (x.teamId.startsWith(p))
                System.out.println(x.teamId);
    }

    public static void main(String[] args) {

        RescueTeam[] t = {
                new MedicalTeam("M101", "Delhi"),
                new FireRescueTeam("F201", "Mumbai"),
                new FoodSupplyTeam("FD301", "Delhi"),
                new MedicalTeam("M102", "Lucknow")
        };

        int m = 0, f = 0, food = 0;

        for (RescueTeam x : t) {
            x.performDuty();

            if (x instanceof MedicalTeam)
                m++;
            else if (x instanceof FireRescueTeam)
                f++;
            else
                food++;
        }

        findTeamByLocation(t, "Delhi");

        System.out.println("Teams starting with M");
        displayTeamsByPrefix(t, "M");

        System.out.println("Medical = " + m);
        System.out.println("Fire = " + f);
        System.out.println("Food = " + food);

        if (m >= f && m >= food)
            System.out.println("Maximum Deployment: Medical Team");
        else if (f >= m && f >= food)
            System.out.println("Maximum Deployment: Fire Rescue Team");
        else
            System.out.println("Maximum Deployment: Food Supply Team");
    }
}