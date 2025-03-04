import java.util.Random;
import java.util.Scanner;

class Round {
    private static final Random random = new Random();
    private static final Dices dices = new Dices();

    public int play() {
        return random.nextInt(10) + 1; // Random points between 1 and 10
    }

    public static int playTurn(Player player, Scanner scanner, Round round) {
        System.out.println(player.getName() + "'s turn. Press 'r' to play...");
        int points = 0;
        for (int i = 0; i < 3; i++) {
            while (!scanner.nextLine().equalsIgnoreCase("r")) {
                System.out.println("Invalid input. Press 'r' to play...");
            }
            points = round.play();
            System.out.println("You earned " + points + " points.");
        }
        player.addPoints(points);
        System.out.println(player.getName() + " earned " + points + " points. Total: " + player.getScore());
        
        return points;
    }
}