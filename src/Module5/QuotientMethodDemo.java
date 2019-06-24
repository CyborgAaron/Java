package Module5;

import java.util.Scanner;

public class QuotientMethodDemo {
    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Divisor Cannot be zero!");
            System.exit(1);
        }
        return number1/number2;
    }

    public static void main(String[] args) {
        //trying catch in the method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two intergers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = quotient(number1, number2);
        System.out.println(number1 + "/" + number2 + " is" +
                result);
        input.close();
    }


}
