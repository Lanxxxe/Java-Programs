import java.util.Scanner; // Program import the Scanner class
import java.math.BigInteger; // Program import the BigInteger class
public class Factorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // Program ask for a number
        System.out.print("Enter a number: "); // Program ask for a number
        int number = userInput.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i)); // Program calculate the factorial of the number
        }  
        System.out.println("The factorial of " + number + " is " + factorial); // Program display the factorial of the number
        userInput.close();
    }
}