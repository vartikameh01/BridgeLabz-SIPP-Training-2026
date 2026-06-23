import java.io.*;

public class Feedback {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        for (int i = 0; i < 5; i++) {
            String msg = br.readLine();

            if (msg.toLowerCase().contains("good"))
                count++;
        }

        System.out.println("Good Feedback Count = " + count);
    }
}