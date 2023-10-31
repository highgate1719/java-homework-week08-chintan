package javahomeworkweek8;
import java.util.Scanner;
/**
 * Write a program in Java to display the pattern like a triangle
 * with a number. For eg  Input number of rows: 10
 */
public class Programme_06_NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// scanner created
        // Ask the user for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Generate and display the number triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                scanner.close(); // scanner closed
            }
            System.out.println();
        }
    }
}




