import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create players
        System.out.print("Enter Player 1 name: ");
       Player player1 = new Player(scanner.nextLine());

        System.out.print("Enter Player 2 name: ");
        Player player2 = new Player(scanner.nextLine());

        int totalRounds = 5;
        Round round = new Round();


        for (int i = 0; i < totalRounds; i++) {
            System.out.println("\nRound " + (i + 1) + " starts!");

            // Player 1 plays
            round.playTurn(player1, scanner, round);

            // Player 2 plays
            round.playTurn(player2, scanner, round);
        }

        // Display final results
        System.out.println("\nGame Over!");
        System.out.println(player1.getName() + " final score: " + player1.getScore());
        System.out.println(player2.getName() + " final score: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}

