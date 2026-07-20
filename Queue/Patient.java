import java.util.PriorityQueue;

class Patient {
    int priority;
    String name;

    public Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}
class EmergencyRoom {
    private PriorityQueue<Patient> triageQueue = 
        new PriorityQueue<>((a, b) -> Integer.compare(a.priority, b.priority));

    public void admitPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient callNextPatient() {
        if (triageQueue.isEmpty()) {
            return null;
        }
        return triageQueue.poll(); 
    }
}