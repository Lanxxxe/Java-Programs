import java.util.Scanner;
public class BooleanChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.print("Enter a boolean value (true or false): ");
        String bool = input.nextLine();
        System.out.println("You entered: " + checkBoolean(bool)); // Check if the input is "true" (case-insensitive) and print the result
        input.close();
    }
    public static boolean checkBoolean(String bool) {
        if (bool.equalsIgnoreCase("true")) { // Check if the input is "true" (case-insensitive)
            return true;
        } else {
            return false;
        }
    }
}

// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It prompts the user to enter a boolean value.
// 3. The program checks if the input is "true" (case-insensitive). If it is, it returns true.
// 4. If the input is not "true", it returns false.
// 5. Finally, it closes the Scanner object.

