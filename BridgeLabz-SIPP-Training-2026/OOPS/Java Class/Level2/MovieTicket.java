class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void book(String m, int s, double p) {
        movieName = m;
        seatNumber = s;
        price = p;
    }

    void display() {
        System.out.println(movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.book("Avengers", 15, 250);
        t.display();
    }
}