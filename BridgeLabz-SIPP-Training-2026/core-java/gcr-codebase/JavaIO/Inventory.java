import java.io.*;
public class Inventory {
    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new FileReader("inventory.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            String[] s = line.split("-");

            if (Integer.parseInt(s[1]) == 0)
                System.out.println(s[0] + " is out of stock");
        }

        br.close();
    }
}