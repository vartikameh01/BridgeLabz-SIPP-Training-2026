import java.util.PriorityQueue;

class Patient {
    int severity;
    String name;

    public Patient(int severity, String name) {
        this.severity = severity;
        this.name = name;
    }
}

class EmergencyRoomTriage {
    
    private PriorityQueue<Patient> triageQueue = 
        new PriorityQueue<>((a, b) -> Integer.compare(b.severity, a.severity));

    public void addPatient(Patient p) {
        triageQueue.offer(p); 
    }

    public Patient treatNext() {
        if (triageQueue.isEmpty()) {
            return null;
        }
        return triageQueue.poll(); 
    }
}