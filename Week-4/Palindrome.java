import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPalindrome = true; 
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(userInput);
        String reveString = new StringBuilder(userInput).reverse().toString();
        for (int i = 0 ; i < userInput.length() ; i++){
            if (userInput.charAt(i) != reveString.charAt(i) ){
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);
        scanner.close();
    }    
}


// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It declares a boolean variable `isPalindrome` and initializes it to `true` to assume the input is a palindrome initially.
// 3. The user is prompted to enter a string, and the input is processed by:
//    - Removing any special characters and spaces using `replaceAll("[^a-zA-Z0-9]", "")`.
//    - Converting the string to lowercase using `toLowerCase()`.
// 4. The cleaned input is then stored in the variable `userInput`.
// 5. The program reverses `userInput` by creating a `StringBuilder`, reversing it, and converting it back to a string.
// 6. A `for` loop iterates through each character of `userInput` and compares it with the corresponding character in the reversed string.
//    - If any characters don't match, `isPalindrome` is set to `false`.
// 7. The program prints `true` if the input string is a palindrome, or `false` if it isn't.
// 8. Finally, the Scanner object is closed to prevent resource leaks.
