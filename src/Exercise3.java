import java.text.DecimalFormat;

public class Exercise3 {

    public static void main(String[] args) {
        double DoubleCelisus1 = 9d;
        double DoubleCelisus2 = 5d;
        float ThirtyTwo = 32f;
        double DoubleFarienheit3 = 89d;

        DecimalFormat df = new DecimalFormat("#.00");
        double sum1 = DoubleCelisus2 / DoubleCelisus1 * (DoubleFarienheit3 - ThirtyTwo);

        System.out.println(DoubleFarienheit3 + " Degree Fahrenheit is " + df.format(sum1) + " degree Celsius.");
    }
}
