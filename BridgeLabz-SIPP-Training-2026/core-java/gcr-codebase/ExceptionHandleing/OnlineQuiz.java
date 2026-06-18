public class OnlineQuiz {

    public static void main(String[] args) {

        String[] answers =
                {"A","B","C","D"};

        for (int i = 0; i <= 5; i++) {

            try {

                if (answers[i].equals("A")) {

                    System.out.println(
                            "Question "
                                    + i
                                    + " matched.");
                }

            }

            catch (
                    ArrayIndexOutOfBoundsException e) {

                System.out.println(
                        "Invalid index: " + i);
            }

            catch (NullPointerException e) {

                System.out.println(
                        "Null value found.");
            }
        }

        System.out.println(
                "Checking completed.");
    }
}