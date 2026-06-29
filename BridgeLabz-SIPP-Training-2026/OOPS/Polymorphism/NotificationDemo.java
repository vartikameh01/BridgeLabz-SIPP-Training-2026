class Notification {
    String recipientName, message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Notification");
    }
}

class Email extends Notification {
    Email(String r, String m) {
        super(r, m);
    }

    void sendNotification() {
        System.out.println("Email sent to " + recipientName + ": " + message);
    }
}

class SMS extends Notification {
    SMS(String r, String m) {
        super(r, m);
    }

    void sendNotification() {
        System.out.println("SMS sent to " + recipientName + ": " + message);
    }
}

class Push extends Notification {
    Push(String r, String m) {
        super(r, m);
    }

    void sendNotification() {
        System.out.println("Push notification to " + recipientName + ": " + message);
    }
}

public class NotificationDemo {
    public static void main(String[] args) {

        Notification[] n = {
                new Email("Aman", "Welcome"),
                new SMS("Rahul", "OTP 1234"),
                new Push("Priya", "New Offer")
        };

        System.out.println("Sent Notifications:");
        for (Notification x : n) {
            x.sendNotification();
        }
    }
}