import java.util.Scanner;
public class SumOfList {
    public static void main(String[] args) {

        //input a number n and print the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers to sum: "); //input
        int n = sc.nextInt(); 
        int sum = 0;
        //logic
        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum of the numbers is: " + sum); //output
        }
        sc.close();
    }
}

// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It prompts the user to enter a number.
// 3. The program initializes a sum variable to 0.
// 4. It then enters a for loop that iterates from 1 to n.
// 5. Inside the loop, it adds the current value of i to the sum.
// 6. After the loop, it displays the result.
// 7. Finally, it closes the Scanner object.


