public class Skill {
    public static void main(String[] args) {

        int[] a = {2, 3, 5, 7};
        int target = 10;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] + a[j] == target)
                    System.out.println(a[i] + " " + a[j]);
            }
        }
    }
}