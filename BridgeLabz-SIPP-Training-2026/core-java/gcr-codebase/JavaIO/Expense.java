import java.io.*;
import java.util.*;

public class Expense {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String item = sc.nextLine();
        int amount = sc.nextInt();

        FileWriter fw = new FileWriter("expenses.txt", true);

        fw.write(item + " - " + amount + "\n");

        fw.close();
    }
}