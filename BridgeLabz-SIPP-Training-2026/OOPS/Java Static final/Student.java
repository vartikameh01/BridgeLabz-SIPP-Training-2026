class Student {
    static String universityName = "AKTU";
    static int count = 0;

    final int rollNumber;
    String name, grade;

    Student(int roll, String name, String grade) {
        this.rollNumber = roll;
        this.name = name;
        this.grade = grade;
        count++;
    }

    static void displayTotalStudents() {
        System.out.println("Students = " + count);
    }

    void display() {
        if (this instanceof Student) {
            System.out.println(universityName + " " + name + " " + rollNumber + " " + grade);
        }
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Ravi", "A");
        s.display();
        Student.displayTotalStudents();
    }
}