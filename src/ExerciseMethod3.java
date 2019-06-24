import java.util.Scanner;

public class ExerciseMethod3 {
    public static int max(int num1, int num2) {
        int sum = num1 + num2;
        return(sum);
    }
    //Convert int to a double and add them both

    public static double max(double num1, double num2) {

        int inum = 13;
        double dnum = inum;
        double sum = num1 + inum;
        return(sum);
    }

    public static void main(String[] args) {

//        int inum = 13;
//        double dnum = inum;
        try (Scanner input = new Scanner(System.in)) {
            if (input.hasNextInt()) {
                int number1 = input.nextInt();
                int number2 = input.nextInt();
//                double number5 = input.
                int sum = max(number1, number2);
                System.out.println("Here is your Answer: " + sum);
            } else {
                double number3 = input.nextDouble();
                double number4 = input.nextDouble();
                double sum = max(number3, number4);
                System.out.println("Here is your Answer: " + sum);
            }
        }
//        System.out.println(su);
    }
}
