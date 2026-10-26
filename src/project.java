import java.util.Random;
import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int die1;
        int die2;
        int sum;
        int point;
        boolean gameOver;
        String playAgain;

        do {
            System.out.println("\nNew game!");

            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            sum = die1 + die2;

            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You crapped out and lost.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You won!");
            } else {
                point = sum;
                gameOver = false;

                System.out.println("The point is now " + point);

                while (!gameOver) {
                    System.out.println("\nTrying for point: " + point);

                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + sum);

                    if (sum == point) {
                        System.out.println("You made the point and won!");
                        gameOver = true;
                    } else if (sum == 7) {
                        System.out.println("You got a seven and lost.");
                        gameOver = true;
                    } else {
                        System.out.println("No win or loss. Keep trying!");
                    }
                }
            }

            do {
                System.out.print("\nPlay again? (Y/N): ");
                playAgain = in.nextLine();

                if (!playAgain.equalsIgnoreCase("Y")
                        && !playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Please enter Y or N.");
                }
            } while (!playAgain.equalsIgnoreCase("Y")
                    && !playAgain.equalsIgnoreCase("N"));

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        in.close();
    }
}
