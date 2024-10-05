import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the users
        System.out.print("Enter a string: "); // Prompt the user to enter a string
        String str = input.nextLine();
        if (isPalindrome(str)) { // Check if the string is a palindrome and display the result
            System.out.println("Is Palindrome? " + true);
        } else {    
            System.out.println("Is Palindrome? " + false);
        }
        input.close(); // Close the Scanner object
    }
    public static boolean isPalindrome(String str) {
        int left = 0; // Initialize two pointers, one at the start and one at the end of the string
        int right = str.length() - 1;

        while (left < right) { // Loop through the string from both ends towards the center
            if (str.charAt(left) != str.charAt(right)) { // If the characters at the current positions are not the same, return false
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}   

// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It prompts the user to enter a string.
// 3. The program initializes two pointers, left and right, at the start and end of the string, respectively.
// 4. It then enters a while loop that continues until the left pointer is less than the right pointer.
// 5. Inside the loop, it compares the characters at the current positions of the left and right pointers.
// 6. If the characters are not the same, it returns false, indicating that the string is not a palindrome.
// 7. If the characters are the same, it moves the left pointer to the right and the right pointer to the left, and continues the loop.
// 8. If the loop completes without finding any mismatched characters, it returns true, indicating that the string is a palindrome.

