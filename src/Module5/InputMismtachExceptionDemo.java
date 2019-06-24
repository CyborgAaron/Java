package Module5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismtachExceptionDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter an Integer: ");
                int number = input.nextInt();
                System.out.println("The number entered is " + number);
                continueInput = false;
            } catch(InputMismatchException ex) {
                System.out.println("try again. (incorrect input: an interger is required");
                //\input.nextLine();
                System.out.println(input.nextLine());
            }
        } while (continueInput);
        input.close();
    }


}
