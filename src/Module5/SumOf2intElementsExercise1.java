package Module5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOf2intElementsExercise1 {

    public static  int quotient(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");
        return number1/number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter an Integer: ");
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                System.out.println("The number entered is " + (number1+number2));
                continueInput = true;
            } catch(InputMismatchException ex) {
                System.out.println("Incorrect Input: two integers are required");
                //\input.nextLine();
                System.out.println(input.nextLine());
            }
        } while (continueInput);
        input.close();
    }
}
