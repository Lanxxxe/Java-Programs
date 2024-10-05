import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declare two 3x3 matrices
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] sumMatrix = new int[3][3];
        // Input for the first matrix
        System.out.println("Enter elements of the first 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        // Input for the second matrix
        System.out.println("Enter elements of the second 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        // Perform matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // Display the result
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sumMatrix[i][j] + "\t"); // Tab space for better formatting
            }
            System.out.println(); // New line after each row
        }
        scanner.close(); // Close the scanner
    }
}

// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It declares three 3x3 matrices: `matrix1`, `matrix2`, and `sumMatrix`.
//    - `matrix1` and `matrix2` will store the user inputs for the two matrices.
//    - `sumMatrix` will store the result of the matrix addition.
// 3. The program prompts the user to input values for `matrix1` by iterating through each element using nested for loops.
// 4. It then prompts the user to input values for `matrix2` in the same way.
// 5. The program performs matrix addition by adding corresponding elements from `matrix1` and `matrix2`, storing the result in `sumMatrix`.
// 6. The sum of the two matrices is then displayed by iterating through the `sumMatrix` and printing each element, formatted with a tab space.
// 7. Finally, the Scanner object is closed to prevent resource leaks.