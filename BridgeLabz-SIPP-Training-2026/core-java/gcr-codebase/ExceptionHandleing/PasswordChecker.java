public class PasswordChecker {

    static void checkPassword(
            String password) {

        try {

            if (password == null) {

                throw new Exception(
                        "Password cannot be null.");
            }

            if (password.isEmpty()) {

                throw new Exception(
                        "Password cannot be empty.");
            }

            if (password.length() < 8) {

                throw new Exception(
                        "Minimum 8 characters required.");
            }

            if (!Character.isUpperCase(
                    password.charAt(0))) {

                throw new Exception(
                        "First letter must be uppercase.");
            }

            if (!Character.isDigit(
                    password.charAt(
                            password.length() - 1))) {

                throw new Exception(
                        "Last character must be a digit.");
            }

            String special =
                    "@#$%&*";

            boolean found = false;

            for (char ch :
                    password.toCharArray()) {

                if (special.indexOf(ch)
                        != -1) {

                    found = true;

                    break;
                }
            }

            if (!found) {

                throw new Exception(
                        "Special character missing.");
            }

            System.out.println(
                    "Strong Password");
        }

        catch (Exception e) {

            System.out.println(
                    e.getMessage());
        }
    }

    public static void main(String[] args) {

        checkPassword(null);

        checkPassword("");

        checkPassword("abc");

        checkPassword("abcdef@1");

        checkPassword("Abcdefgh@");

        checkPassword("Abcdefgh@1");
    }
}