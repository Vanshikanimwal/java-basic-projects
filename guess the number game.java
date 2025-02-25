import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 5;
        
        System.out.println("🎯 Welcome to the Number Guessing Game! 🎯");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it. Good luck!\n");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("🎉 Congratulations! You guessed the number correctly in " + attempt + " attempts!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("🔼 Too low! Try again.");
            } else {
                System.out.println("🔽 Too high! Try again.");
            }

            if (attempt == maxAttempts) {
                System.out.println("\n❌ Game Over! The correct number was: " + randomNumber);
            }
        }

        sc.close();
    }
}
