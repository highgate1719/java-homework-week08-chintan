package javahomeworkweek8;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by
 * the user and print the sum of those numbers.
 * Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 */
public class ReadingUserInputChallenge {
    public static void hasNextInt() {
        //create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        //Use a while loop to continue reading numbers until we have read 10 valid integers
        //Inside the loop, we use hasNextInt() to check if the next input is an integer.
        while (count < 10) {
            System.out.print("Enter number #" + (count + 1) + " : ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                //If it is, we use nextInt() to get the integer value and add it to the sum.
                // We also increment the count
                sum += number;
                count++;
            } else {
                //If the input is not a valid integer,
                // we print "Invalid Number" and use scanner.next() to clear the invalid input.
                System.out.println("Invalid Number");
                scanner.nextInt();
            }
        }
//we print 10 numbers and close the Scanner when we are done
        scanner.close();
    }

    public static void main(String[] args) {
        //Calling static method into the main method
        hasNextInt();
    }
}

