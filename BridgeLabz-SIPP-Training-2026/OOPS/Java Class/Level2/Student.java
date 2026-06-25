class Student {
    String name;
    int rollNumber, marks;

    Student(String n, int r, int m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    String grade() {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else return "C";
    }

    void display() {
        System.out.println(name + " " + rollNumber);
        System.out.println("Grade = " + grade());
    }

    public static void main(String[] args) {
        Student s = new Student("Rahul", 101, 85);
        s.display();
    }
}