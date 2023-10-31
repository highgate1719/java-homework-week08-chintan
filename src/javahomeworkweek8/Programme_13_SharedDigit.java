package javahomeworkweek8;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If one of the numbers is not within the range,
 * the method should return false.
 * The method should return true if there is a digit that appears in
 * both numbers, such as 2 in 12 and 23; otherwise,
 * the method should return false.
 */
public class Programme_13_SharedDigit {

    public static void main(String[] args) {//main method

        boolean answer = false;

        answer = hasSharedDigit(12, 23);//hasSharedDigit method calling in main method
        System.out.println("hasSharedDigit(12, 23)->" + answer);

        answer = hasSharedDigit(9, 99);//hasSharedDigit method calling in main method
        System.out.println("hasSharedDigit(9, 99)->" + answer);

        answer = hasSharedDigit(15, 55);//hasSharedDigit method calling in main method
        System.out.println("hasSharedDigit(15, 55)->" + answer);

    }
    public static boolean hasSharedDigit(int num1, int num2) {//public static method with two parameters
        boolean answer = false;
        if (num1 < 10 || num1 > 99) { // condition declared
            answer = false;
        } else if (num2 < 10 || num2 > 99) { // condition declared
            answer = false;
        } else { // condition declared
            int leftnum1 = num1 / 10;
            int rightnum1 = num1 % 10;
            int leftnum2 = num2 / 10;
            int rightnum2 = num2 % 10;
            if (leftnum1 == leftnum2 || leftnum1 == rightnum2 || rightnum1 == leftnum2 || rightnum1 == rightnum2) {
                answer = true;
            }
        }
        return answer;
    }

}


