public class Exercise17 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            int k = 6 + i;
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }

}
