package javahomeworkweek8;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 */


public class Programme_08_RightAngleTriangle {


    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in);//scanner created
        // Ask the user for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Generate and display the right angle triangle pattern
        // Nested For Loop
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
            scanner.close();// scanner closed
        }
    }
}
