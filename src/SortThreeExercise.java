import java.util.Scanner;

public class SortThreeExercise {

    public static void displaySortedNumbers (double num1, double num2, double num3) {
        double temp;

        if (num2 < num1 && num2 < num3) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        else if (num3 < num1 && num3 < num2) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("These are arsorted from: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        System.out.print("Here you go: ");
        displaySortedNumbers(num1, num2, num3);

        System.out.print("" + num1 + " " + num2 + " " + num3 + " The medium: " + num2);
    }
}
