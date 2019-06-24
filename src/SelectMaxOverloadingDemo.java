import java.util.Scanner;

public class SelectMaxOverloadingDemo {
    public static void max(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("The bigger Number is " + number1);
        } else {
            System.out.println("This bigger number is " + number2);
        }
    }

    public static void max(double number3, double number4) {
        if (number3 > number4) {
            System.out.println("The bigger Number is " + number3);
        } else {
            System.out.println("This bigger number is " + number4);
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            if (input.hasNextInt()) {
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                max(number1, number2);
            } else {
                double number3 = input.nextDouble();
                double number4 = input.nextDouble();
                max(number3, number4);
            }
        }
    }
}

