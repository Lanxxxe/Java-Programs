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
