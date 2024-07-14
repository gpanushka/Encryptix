import java.util.*;


public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int lowerLimit = 1;
        int upperLimit = 100;
        int maxAttempts = 10;
        int totalAttempts = 0;
        int roundsWon = 0;

        boolean playAgain = true;

        while(playAgain) {
            int randNum = rd.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
            int attempts = 0;

            System.out.println("\nWelcome to the Number Guessing Game!:");
            System.out.println("Guess a number between " + lowerLimit + " and "+ upperLimit + ":");

            while (attempts < maxAttempts) {
                int guess = sc.nextInt();
                attempts++;

                if (guess == randNum) {
                    System.out.println("Congratulations! You have guessed the numeber in " + attempts + "attempts.");
                    roundsWon++;
                    break;
                } else if (guess < randNum) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if(attempts == maxAttempts) {
                System.out.println("Sorry, you ran out of attempts. The secret number was "+ randNum + ".");
            }

            totalAttempts += attempts;

            System.out.println("Do you want to play again? (y/n)");
            String playAgainInput = sc.next();
            playAgain = playAgainInput.equalsIgnoreCase("y");
        }

        System.out.println("\nGame Over!");
        System.out.println("\nScore Board:");
        System.out.println("Total attempts: " + totalAttempts);
        System.out.println("Rounds won: " + roundsWon);

        if(roundsWon == 0){
            System.out.println("You didn't win any round.");
        } else {
            System.out.println("Average attempts per round: " + (totalAttempts / (double) roundsWon));
        }
    
    sc.close();
    }
}
