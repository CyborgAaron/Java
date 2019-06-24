package Module5;

import java.util.Scanner;

public class QuotientWithExceptionDemo {


    public static  int quotient(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");
        return number1/number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two intergers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        //Expression handling
        try { int result = quotient(number1, number2);
            System.out.println(number1 + "/" + number2 + " is" +
                    result); }
        catch (ArithmeticException ex /*ex means Exception*/) {
            System.out.println("Exception: an integer cannot be divided by zero!");
        } finally {
            System.out.println("Well done");
            //Will be executed regrADLESS THE OUTCOME
        }System.out.println("execution continues ....");
        input.close();
    }
        }

