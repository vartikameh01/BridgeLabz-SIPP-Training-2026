import java.io.*;

class Employee implements Serializable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Test {
    public static void main(String[] args) throws Exception {

        Employee e = new Employee(101, "Rahul");

        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("emp.dat"));
        out.writeObject(e);
        out.close();

        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("emp.dat"));

        Employee emp = (Employee) in.readObject();

        System.out.println(emp.id + " " + emp.name);
        in.close();
    }
}