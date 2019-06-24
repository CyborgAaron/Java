public class PrimitiveLongDemo {
    public static void main(String[] args) {
        long num1 = 2_345_678_901L;
        long num2 = 1_234_567_890L;
        long sum = num1 * num2;
        System.out.println(sum);
        System.out.println(String.format("%,d", sum));


    }
}
