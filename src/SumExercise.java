public class SumExercise {
    void sum(int a, int b) {
        System.out.println("the sum is: " + (a+b));
    }

    void sum (int a, double b) {
        System.out.println("the sum is: " + (a+b));
    }
    void sum (double a, double b) {
        System.out.println("the sum is: " + (a+b));
    }
    void sum (double a, int b) {
        System.out.println("the sum is: " + (a+b));
    }

    public static void main(String[] args) {
        SumExercise calculate = new SumExercise();
        calculate.sum(8, 5);
        calculate.sum(8, 5.12);
        calculate.sum(8.34, 5);
        calculate.sum(8.34, 5.12);
    }
}
