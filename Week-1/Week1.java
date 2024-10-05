/* Check the file and answer the following items. Attach in your document as .PDF. 
Submission must include the Java Code, screenshot of the output, and the explanation of your solution. */

import java.util.Scanner;
public class Week1 {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in); // Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the first number: "); // Program ask for First number
        int firstNumber = userInput1.nextInt();

        System.out.print("Enter the second number: "); // Program ask for Second number
        int secondNumber = userInput1.nextInt();
        userInput1.close();

        int sum = firstNumber + secondNumber; // Program calculate the sum of the two numbers
        int product = firstNumber * secondNumber; // Program calculate the product of the two numbers
        int difference = firstNumber - secondNumber; // Program calculate the difference of the two numbers
        int quotient = firstNumber / secondNumber; // Program calculate the quotient of the two numbers
    
        // Program display the answers of the two numbers
        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The product of the two numbers is: " + product);
        System.out.println("The difference of the two numbers is: " + difference);
        System.out.println("The quotient of the two numbers is: " + quotient);
    }
}