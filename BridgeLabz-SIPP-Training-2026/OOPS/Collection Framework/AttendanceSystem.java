import java.util.*;
class AttendanceSystem {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> attendance = new HashMap<>();

        attendance.put("Java", new ArrayList<>());
        attendance.put("Python", new ArrayList<>());

        if (!attendance.get("Java").contains("Rahul"))
            attendance.get("Java").add("Rahul");

        if (!attendance.get("Java").contains("Aman"))
            attendance.get("Java").add("Aman");

        if (!attendance.get("Java").contains("Rahul"))
            attendance.get("Java").add("Rahul");

        if (!attendance.get("Python").contains("Riya"))
            attendance.get("Python").add("Riya");

        // Display
        for (String subject : attendance.keySet()) {

            System.out.println("\nSubject : " + subject);

            System.out.println(attendance.get(subject));

            System.out.println("Total Students = " + attendance.get(subject).size());
        }
    }
}