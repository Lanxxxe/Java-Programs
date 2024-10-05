import java.util.Scanner;
public class OddOrEven {
    public class OddEven {
        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter a number: "); // Program ask for a number
            int number = userInput.nextInt();
            if (number % 2 == 0) { // Program determine if the number is odd or even
                System.out.println  ("Output: Even.");
            } else {
                System.out.println("Output: Odd.");
            }
            userInput.close(); // Program close the scanner
        }
    }
}


// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It prompts the user to enter a number.
// 3. The program uses the modulus operator (%) to determine if the number is odd or even.
// 4. If the number is even (i.e., the remainder when divided by 2 is 0), it prints "Even."
// 5. Otherwise, it prints "Odd."
// 6. Finally, it closes the Scanner object.

