import java.util.*;
class MusicPlaylist {
    public static void main(String[] args) {

        LinkedList<String> songs = new LinkedList<>();

        songs.addFirst("Song1");
        songs.addFirst("Song2");
        songs.addFirst("Song3");
        songs.addFirst("Song4");
        songs.addFirst("Song5");
        songs.addFirst("Song6");
        songs.addFirst("Song7");
        songs.addFirst("Song8");
        songs.addFirst("Song9");
        songs.addFirst("Song10");
        songs.addFirst("Song11");

        if (songs.size() > 10) {
            songs.removeLast();
        }

        String search = "Song5";

        if (songs.contains(search))
            System.out.println(search + " Found");
        else
            System.out.println(search + " Not Found");

        System.out.println("\nRecently Played Songs");
        for (String s : songs)
            System.out.println(s);
    }
}