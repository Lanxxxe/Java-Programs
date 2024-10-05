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
