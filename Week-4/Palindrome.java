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
