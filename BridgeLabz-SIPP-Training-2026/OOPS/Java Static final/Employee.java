class Employee {
    static String companyName = "TCS";
    static int count = 0;

    final int id;
    String name, designation;

    Employee(int id, String name, String desig) {
        this.id = id;
        this.name = name;
        this.designation = desig;
        count++;
    }

    static void displayTotalEmployees() {
        System.out.println("Employees = " + count);
    }

    void display() {
        if (this instanceof Employee) {
            System.out.println(companyName + " " + name + " " + id + " " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee(1, "Aman", "Dev");
        e.display();
        Employee.displayTotalEmployees();
    }
}