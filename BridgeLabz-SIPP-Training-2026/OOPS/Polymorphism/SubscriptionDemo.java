class Subscription {
    String subscriberName, subscriptionId;

    Subscription(String subscriberName, String subscriptionId) {
        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    int calculateMonthlyCharge() {
        return 0;
    }
}

class BasicPlan extends Subscription {
    BasicPlan(String n, String id) {
        super(n, id);
    }

    int calculateMonthlyCharge() {
        return 300;
    }
}

class PremiumPlan extends Subscription {
    PremiumPlan(String n, String id) {
        super(n, id);
    }

    int calculateMonthlyCharge() {
        return 600;
    }
}

class FamilyPlan extends Subscription {
    FamilyPlan(String n, String id) {
        super(n, id);
    }

    int calculateMonthlyCharge() {
        return 900;
    }
}

public class SubscriptionDemo {

    static void search(Subscription[] s, String id) {
        for (Subscription x : s)
            if (x.subscriptionId.equals(id))
                System.out.println("Found: " + x.subscriberName);
    }

    static void display(Subscription[] s, char ch) {
        for (Subscription x : s)
            if (x.subscriberName.startsWith("" + ch))
                System.out.println(x.subscriberName);
    }

    static void revenue(Subscription[] s) {
        int total = 0;
        for (Subscription x : s)
            total += x.calculateMonthlyCharge();
        System.out.println("Revenue = " + total);
    }

    public static void main(String[] args) {

        Subscription[] s = {
                new BasicPlan("Aman", "S1"),
                new PremiumPlan("Rahul", "S2"),
                new FamilyPlan("Ankit", "S3")
        };

        Subscription max = s[0];

        for (Subscription x : s) {
            System.out.println(x.subscriberName + " = " + x.calculateMonthlyCharge());

            if (x.calculateMonthlyCharge() > max.calculateMonthlyCharge())
                max = x;
        }

        revenue(s);
        search(s, "S2");

        System.out.println("Names starting with A");
        display(s, 'A');

        System.out.println("Most Expensive = " + max.subscriptionId);
    }
}