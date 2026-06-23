import java.io.*;

public class EmailCount {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("emails.txt"));

        int gmail = 0, yahoo = 0;
        String email;

        while ((email = br.readLine()) != null) {

            if (email.endsWith("gmail.com"))
                gmail++;
            else if (email.endsWith("yahoo.com"))
                yahoo++;
        }

        System.out.println("Gmail = " + gmail);
        System.out.println("Yahoo = " + yahoo);

        br.close();
    }
}