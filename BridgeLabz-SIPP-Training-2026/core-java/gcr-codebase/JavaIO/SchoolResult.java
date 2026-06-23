import java.io.*;

public class SchoolResult {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt", true));

            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                int avg = (Integer.parseInt(s[1]) + Integer.parseInt(s[2]) + Integer.parseInt(s[3])) / 3;

                bw.write(s[0] + " Average = " + avg);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}