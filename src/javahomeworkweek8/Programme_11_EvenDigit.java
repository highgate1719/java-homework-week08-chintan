package javahomeworkweek8;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of
 * type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to
 * indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme_11_EvenDigit {
    public static void main(String[] args) {// main method
        System.out.println("Sum of even numbers 123456789  := " +getEvenDigitSum(123456789)); // Output: 20
        System.out.println("Sum of even numbers  252  := " +getEvenDigitSum(252));      // Output: 4
        System.out.println("Sum of even numbers -22 := " +getEvenDigitSum(-22));      // Output: -1
    }

    public static int getEvenDigitSum(int number) {// public static method with parameter
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {// to get even number total
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

}
