import java.util.Scanner;
public class VowelChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Starts with a vowel: " + checkVowel(str)); // Check if the string starts with a vowel and print the result
        input.close();
    }
    public static boolean checkVowel(String str) { 
        if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u' ||
            str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I' || str.charAt(0) == 'O' || str.charAt(0) == 'U') { // Check if the first character is a vowel (either lowercase or uppercase)
            return true;
        }
        return false;
    }
    
}

// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It prompts the user to enter a string.
// 3. The program checks if the first character of the string is a vowel (either lowercase or uppercase).
// 4. If it is, it returns true. Otherwise, it returns false.
// 5. Finally, it closes the Scanner object.

