package Module5;

import java.util.Scanner;

public class QuotientDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two intergers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println(number1 + "/" + number2 + " is "
                + (number1/number2));
    }
}
