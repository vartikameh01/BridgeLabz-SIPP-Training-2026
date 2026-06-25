interface HeartRateMonitor {
    void showHeartRate();

    default void displayHealthTips() {
        System.out.println("Exercise regularly.");
    }

    static boolean isPatientIdValid(String patientId) {
        return patientId.length() == 5;
    }
}

interface TemperatureMonitor {
    void showTemperature();

    default void displayHealthTips() {
        System.out.println("Drink enough water.");
    }
}

class HealthMonitoringSystem
        implements HeartRateMonitor, TemperatureMonitor {

    public void showHeartRate() {
        System.out.println("Heart Rate: 72 BPM");
    }

    public void showTemperature() {
        System.out.println("Temperature: 98.6 F");
    }

    public void displayHealthTips() {
        System.out.println("Maintain a healthy lifestyle.");
    }
}

public class HealthDemo {
    public static void main(String[] args) {

        String[] names = {"Ravi", "Neha", "Karan"};
        String[] ids = {"P1234", "P12", "P5678"};

        HealthMonitoringSystem h = new HealthMonitoringSystem();

        h.displayHealthTips();

        for (int i = 0; i < names.length; i++) {

            System.out.println("\nPatient: " + names[i]);

            if (HeartRateMonitor.isPatientIdValid(ids[i])) {
                System.out.println("ID Valid");
                h.showHeartRate();
                h.showTemperature();
                System.out.println("Health Report Generated");
            } else {
                System.out.println("Invalid Patient ID");
            }
        }
    }
}