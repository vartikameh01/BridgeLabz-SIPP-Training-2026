class Book {
    static String libraryName = "City Library";

    final String isbn;
    String title, author;

    Book(String t, String a, String i) {
        this.title = t;
        this.author = a;
        this.isbn = i;
    }

    static void displayLibraryName() {
        System.out.println(libraryName);
    }

    void display() {
        if (this instanceof Book) {
            System.out.println(title + " " + author + " " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James", "123");
        Book.displayLibraryName();
        b.display();
    }
}