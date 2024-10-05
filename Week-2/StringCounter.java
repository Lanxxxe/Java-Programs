import java.util.Scanner;
public class StringCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.print("Enter a string: "); // Prompt the user to enter a string
        String str = input.nextLine();
        System.out.print("Enter a character ti count: "); // Prompt the user to enter a character to count
        char ch = input.next().charAt(0);
        int count = 0; // Initialize a counter to keep track of the number of occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("The number of " + ch + " in the string is: " + count); // Display the result
        input.close(); // Close the Scanner object
    }
}

// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It prompts the user to enter a string and a character to count.
// 3. The program initializes a counter to keep track of the number of occurrences of the character.
// 4. It then enters a for loop that iterates through each character in the string.
// 5. Inside the loop, it checks if the current character is equal to the character to count.
// 6. If it is, it increments the counter.
// 7. After the loop, it displays the result.
// 8. Finally, it closes the Scanner object.

