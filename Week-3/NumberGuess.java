import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //input
        Random rand = new Random(); //logic
        boolean playAgain = true;
        while (playAgain) { // while loop to play again
            int numberToGuess = rand.nextInt(100) + 1;
            int numberOfTries = 0;
            System.out.println("I'm thinking of a number between 1 and 100.");
            while (numberOfTries < 3) { //while loop to guess the number
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                numberOfTries++;
                if (guess == numberToGuess) { //if the guess is correct
                    System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries!");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            System.out.print("Do you want to play again? (yes/no): "); //output 
            String playAgainResponse = sc.next().toLowerCase(); 
            playAgain = playAgainResponse.equals("yes") || playAgainResponse.equals("y");
        }
        System.out.println("Thanks for playing!");
        sc.close();
    }
}

// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It also creates a Random object to generate random numbers.
// 3. The program enters a while loop that continues until the user decides to stop playing.
// 4. Inside the loop, it generates a random number between 1 and 100.
// 5. It then enters another while loop that continues until the user has guessed the number or used up their three tries.
// 6. Inside this loop, it prompts the user to enter a guess and increments the number of tries.


