import java.util.Scanner;
public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        // Accept input from the user
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Initialize min and max values
        int min = numbers[0];
        int max = numbers[0];
        // Find minimum and maximum values
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        scanner.close();
        // Display the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It declares an integer array `numbers` with a size of 10 to store the user's input.
// 3. The program prompts the user to enter 10 integers and stores each number in the `numbers` array.
// 4. It initializes two variables `min` and `max` to the first element of the array.
// 5. A for-each loop iterates over the array `numbers`.
//    - If the current number is smaller than `min`, it updates `min`.
//    - If the current number is larger than `max`, it updates `max`.
// 6. The program closes the Scanner object to prevent resource leaks.
// 7. Finally, it displays the minimum and maximum values found in the array.