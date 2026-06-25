class InterviewBot {
    String botName;
    String technology;

    InterviewBot(String botName,
                 String technology) {
        this.botName = botName;
        this.technology = technology;
    }

    void conductInterview() {
        System.out.println(botName +
                " is conducting a " +
                technology + " interview.");
    }

    public static void main(String[] args) {

        InterviewBot b1 =
            new InterviewBot("BotA", "Java");

        InterviewBot b2 =
            new InterviewBot("BotB", "Python");

        InterviewBot b3 =
            new InterviewBot("BotC", "AI");

        b1.conductInterview();
        b2.conductInterview();
        b3.conductInterview();
    }
}