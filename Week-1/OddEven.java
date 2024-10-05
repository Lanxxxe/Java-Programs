import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: "); // Program ask for a number
        int number = userInput.nextInt();
        if (number % 2 == 0) { // Program determine if the number is odd or even
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        userInput.close(); // Program close the scanner
    }
}
