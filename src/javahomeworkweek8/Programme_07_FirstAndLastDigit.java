package javahomeworkweek8;
import java.util.Scanner;
/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * <p>
 * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257);
 * →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit
 * and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
 * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we
 * only have 1 digit, which gives us 5+5 and the sum is 10.
 * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class Programme_07_FirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number) { // Method With return with parameters
        if (number < 0) { // Condition declared
            return -1; // Returns -1 for negative numbers
        }
        int firstDigit = 0;
        int lastDigit = number % 10; // Get the last digit

        for (int i = number; i != 0; i /= 10) { // for loop
            if (i < 10) {
                firstDigit = i; // The last iteration will give us the first digit
            }
        }
        return firstDigit + lastDigit; // Return the sum of the first and last digits
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // created scanner
        System.out.println("Enter number: ");
        int number = scanner.nextInt(); // the next line
        int answer = sumFirstAndLastDigit(number); // answer of first and last digit number
        System.out.println("The sum of first and last digit is: " + answer); //Printing statement for answer
        scanner.close(); // scanner closed
    }
}
