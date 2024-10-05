import java.util.Scanner;
public class Days {
    public static void main(String[] args) { // WAP to input a number (1-7) and print the day of the week using switch case
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.println("Enter the day number: "); //1-7
        int day = sc.nextInt();
        switch (day) {
            case 1: //case 1 is the day number
                System.out.println("Monday"); //Monday is the day name
                break;
            case 2: //case 2 is the day number
                System.out.println("Tuesday"); //Tuesday is the day name
                break;
            case 3: //case 3 is the day number
                System.out.println("Wednesday"); //Wednesday is the day name
                break;
            case 4: //case 4 is the day number
                System.out.println("Thursday"); //Thursday is the day name
                break;
            case 5: //case 5 is the day number
                System.out.println("Friday"); //Friday is the day name
                break;
            case 6: //case 6 is the day number
                System.out.println("Saturday"); //Saturday is the day name
                break;
            case 7: //case 7 is the day number
                System.out.println("Sunday"); //Sunday is the day name
                break;
            default: //default is the day number
                System.out.println("Invalid day"); //Invalid day is the day name
        }
        sc.close();
    }
}

// Explanation:
// 1. The program starts by creating a Scanner object to read input from the user.
// 2. It prompts the user to enter a number (1-7).
// 3. The program uses a switch statement to determine the day of the week based on the input number.
// 4. It prints the corresponding day name.
// 5. If the input number is not between 1 and 7, it prints "Invalid day".
// 6. Finally, it closes the Scanner object.

