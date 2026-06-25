interface TextModeration {
    boolean checkOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.contains("bad");
    }
}

interface SpamDetection {
    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("No spam allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public boolean checkOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean checkSpam(String post) {
        return post.contains("buy now");
    }

    public void displayModerationPolicy() {
        System.out.println("Offensive and Spam content is prohibited.");
    }
}

public class ModerationDemo {
    public static void main(String[] args) {

        String[] posts = {
                "Hello everyone",
                "buy now and win",
                "This is a bad post",
                "Good morning"
        };

        ContentModerator cm = new ContentModerator();

        for (String post : posts) {

            if (cm.checkSpam(post))
                System.out.println(post + " -> Spam Post");

            else if (cm.checkOffensive(post))
                System.out.println(post + " -> Offensive Post");

            else
                System.out.println(post + " -> Valid Post");
        }
    }
}