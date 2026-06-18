public class SmartLibrary {

    static String[] books =
            {"Java","Python",null,"C++"};

    static int getBookLength(
            int index) {

        try {

            return books[index].length();

        }

        catch (
                ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Invalid index.");

            return -1;
        }

        catch (
                NullPointerException e) {

            System.out.println(
                    "Book is empty.");

            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println(
                getBookLength(10));

        System.out.println(
                getBookLength(2));
    }
}