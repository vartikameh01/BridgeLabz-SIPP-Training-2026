import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int n = (int)(Math.random() * 3);

        if (n == 0)
            return "Rock";
        else if (n == 1)
            return "Paper";
        else
            return "Scissors";
    }

    public static String findWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer))
            return "Draw";

        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper")))
            return "Player";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int playerWins = 0;
        int computerWins = 0;

        System.out.println("\nGame\tPlayer\tComputer\tWinner");

        for (int i = 1; i <= games; i++) {

            System.out.print("Enter Rock, Paper or Scissors: ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("Player"))
                playerWins++;
            else if (winner.equals("Computer"))
                computerWins++;

            System.out.println(i + "\t" + userChoice + "\t" +
                    computerChoice + "\t\t" + winner);
        }

        double playerPercent = (playerWins * 100.0) / games;
        double computerPercent = (computerWins * 100.0) / games;

        System.out.println("\n----- Statistics -----");
        System.out.println("Player Wins   : " + playerWins);
        System.out.println("Computer Wins : " + computerWins);

        System.out.printf("Player Win Percentage   : %.2f%%\n", playerPercent);
        System.out.printf("Computer Win Percentage : %.2f%%\n", computerPercent);
    }
}