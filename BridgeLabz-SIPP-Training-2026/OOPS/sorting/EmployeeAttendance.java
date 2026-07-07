import java.util.Arrays;

public class EmployeeAttendance {

    public static void main(String[] args) {

        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};

        int k = 3;

        Integer[] index = new Integer[employeeIds.length];

        for (int i = 0; i < employeeIds.length; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> {

            if (attendance[a] != attendance[b]) {
                return attendance[b] - attendance[a];
            }

            return employeeIds[a] - employeeIds[b];
        });

        System.out.print("Top " + k + " Employees: ");

        for (int i = 0; i < k; i++) {
            System.out.print(employeeIds[index[i]] + " ");
        }
    }
}