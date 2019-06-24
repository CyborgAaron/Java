import java.util.Random;

public class Exercise12 {
    public static void main(String[] args) {
        boolean shouldContinue = true;
        while (shouldContinue == true) {
            Random r = new Random();
            int low = 1;
            int high = 101;
//        int mid = r.nextInt(50);
            int result = r.nextInt(high-low) + low;
            System.out.println(result);
            if (result > 50) {
                shouldContinue = true;
            } else {
                shouldContinue = false;

            }
        }
    }
}
