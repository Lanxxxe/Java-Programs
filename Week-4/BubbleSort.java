import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int[] arrayOfNums = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0 ; i < arrayOfNums.length; i++){
            arrayOfNums[i] = user_input.nextInt();
        }
        for (int i = 0 ; i < arrayOfNums.length ; i++) {
            for (int j = 0 ; j < arrayOfNums.length - 1 ; j++ ){
                if (arrayOfNums[i] < arrayOfNums[j]) {
                    int temp = arrayOfNums[i];
                    arrayOfNums[i] = arrayOfNums[j];
                    arrayOfNums[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for (int x : arrayOfNums) {
            System.out.print(x + " ");
        }
        user_input.close();
    }
}

// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It declares an array named `arrayOfNums` to hold 5 integers.
// 3. The user is prompted to enter 5 numbers, which are stored in the `arrayOfNums` array.
// 4. A nested for loop is used to perform the bubble sort algorithm.
//    - The outer loop iterates through each element of the array.
//    - The inner loop compares adjacent elements in the array and swaps them if they are in the wrong order.
// 5. Inside the inner loop, if the current element is smaller than the next element, they are swapped using a temporary variable `temp`.
// 6. Once the sorting is complete, the program prints the sorted array in ascending order.
// 7. Finally, the program closes the Scanner object to prevent resource leaks.