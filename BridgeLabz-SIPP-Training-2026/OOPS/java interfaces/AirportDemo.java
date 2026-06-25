interface LuggageScanner {
    boolean scanLuggage(String name);

    default void displaySecurityGuidelines() {
        System.out.println("Follow airport security rules.");
    }

    static boolean isPassportNumberValid(String passportNo) {
        return passportNo.length() == 8;
    }
}

interface PassportVerifier {
    boolean verifyPassport(String passportNo);

    default void displaySecurityGuidelines() {
        System.out.println("Carry valid travel documents.");
    }
}

class AirportSecuritySystem implements LuggageScanner, PassportVerifier {

    public boolean scanLuggage(String name) {
        return true; // luggage passed
    }

    public boolean verifyPassport(String passportNo) {
        return LuggageScanner.isPassportNumberValid(passportNo);
    }

    public void displaySecurityGuidelines() {
        System.out.println("Airport Security Guidelines");
    }
}

public class AirportDemo {
    public static void main(String[] args) {

        String[] passengers = {"Rahul", "Aman", "Priya"};
        String[] passports = {"AB123456", "P123", "XY987654"};

        AirportSecuritySystem a = new AirportSecuritySystem();

        for (int i = 0; i < passengers.length; i++) {
            if (a.verifyPassport(passports[i]) &&
                a.scanLuggage(passengers[i])) {
                System.out.println(passengers[i] + " -> Can Board");
            } else {
                System.out.println(passengers[i] + " -> Cannot Board");
            }
        }
    }
}