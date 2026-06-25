class Patient {
    static String hospitalName = "City Hospital";
    static int count = 0;

    final int patientID;
    String name, ailment;
    int age;

    Patient(int id, String name, int age, String ailment) {
        this.patientID = id;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        count++;
    }

    static void getTotalPatients() {
        System.out.println("Patients = " + count);
    }

    void display() {
        if (this instanceof Patient) {
            System.out.println(hospitalName + " " + name + " " + patientID + " " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient p = new Patient(1, "Ram", 30, "Fever");
        p.display();
        Patient.getTotalPatients();
    }
}