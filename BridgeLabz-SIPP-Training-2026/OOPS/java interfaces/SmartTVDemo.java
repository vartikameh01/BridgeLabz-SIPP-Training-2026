interface StreamingService {
    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    public void streamMovie() {
        System.out.println("Movie Streaming");
    }

    public void playGame() {
        System.out.println("Game Playing");
    }

    // Resolving default method conflict
    public void showSubscriptionDetails() {
        System.out.println("Streaming + Gaming Subscription Active");
    }
}

public class SmartTVDemo {
    public static void main(String[] args) {

        String[] movies = {"Avengers", "Avatar", "Frozen"};
        String[] games = {"Minecraft", "FIFA", "GTA"};

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("Movies:");
        for (String m : movies)
            System.out.println(m);

        System.out.println("Games:");
        for (String g : games)
            System.out.println(g);
    }
}