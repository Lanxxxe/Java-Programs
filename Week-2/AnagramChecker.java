import java.util.Scanner;
import java.util.Arrays;
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user  
        System.out.print("Enter the first string: "); // Prompt the user to enter the first string
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        String userInput1 = str1.replaceAll(" ", "").toLowerCase(); // Remove all spaces and convert to lowercase
        String userInput2 = str2.replaceAll(" ", "").toLowerCase();
        if (userInput1.length() != userInput2.length()) { // Check if the lengths of the strings are not equal
            System.out.println("The strings are not anagrams.");
        } else {
            char[] str1Array = userInput1.toCharArray(); // Convert the strings to character arrays, sort them, and compare
            char[] str2Array = userInput2.toCharArray();
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            
            if (Arrays.equals(str1Array, str2Array)) { // Check if the sorted arrays are equal
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }
        input.close();
    }
}

// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It prompts the user to enter two strings.
// 3. The program removes all spaces and converts the strings to lowercase to ensure the comparison is case-insensitive and space-insensitive.
// 4. It checks if the lengths of the strings are not equal. If they are not, it prints that the strings are not anagrams.
// 5. If the lengths are equal, it converts the strings to character arrays, sorts them, and compares them.
// 6. If the sorted arrays are equal, it prints that the strings are anagrams. Otherwise, it prints that the strings are not anagrams.
// 7. Finally, it closes the Scanner object.
