package javahomeworkweek8;
import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10_Armstrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner created

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if it's an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();//scanner closing.
    }

    public static boolean isArmstrong(int num) {// method to find armstrong no
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = num;

        // Calculate the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }
        originalNumber = num;

        // Calculate the Armstrong number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        return result == num;
    }
}
