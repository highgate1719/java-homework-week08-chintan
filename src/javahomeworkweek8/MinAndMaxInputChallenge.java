package javahomeworkweek8;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user
 * and print the minimum and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {//main method
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.maxMin();// method calling in main method
    }

    public void maxMin() { // method to get min max value
        Scanner scanner = new Scanner(System.in);//scanner created
        int min = Integer.MAX_VALUE; // integer assigned
        int max = Integer.MIN_VALUE; // integer assigned
        while (true) {//endless while loop
            System.out.println("Enter number   : ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n > max) {
                    max = n;
                }
                if (n < min) {
                    min = n;
                }
            } else {
                System.out.println("Minimum Number is: " + min);
                System.out.println("Maximum Number is: " + max);
                break;
            }
        }
        scanner.close();//scanner closed
    }
}









