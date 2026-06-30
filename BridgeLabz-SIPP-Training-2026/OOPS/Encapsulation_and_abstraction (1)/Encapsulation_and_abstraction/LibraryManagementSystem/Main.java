public class Main {
    public static void main(String[] args) {
        Book book = new Book(101, "Java Programming", "James Gosling");
        Magazine magazine = new Magazine(102, "Tech Today", "ABC Publications");
        DVD dvd = new DVD(103, "Avengers Endgame", "Marvel Studios");
        System.out.println("----- Book -----");
        book.displayItemDetails();
        System.out.println("Loan Duration : " + book.getLoanDuration() + " days");
        System.out.println();
        System.out.println("----- Magazine -----");
        magazine.displayItemDetails();
        System.out.println("Loan Duration : " + magazine.getLoanDuration() + " days");
        System.out.println();
        System.out.println("----- DVD -----");
        dvd.displayItemDetails();
        System.out.println("Loan Duration : " + dvd.getLoanDuration() + " days");
    }
}