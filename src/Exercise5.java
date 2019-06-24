import java.text.DecimalFormat;

public class Exercise5 {
    public static void main(String[] args) {
        final double dollarRate = 1.5913;
        double poundSterlings = 8d;

        float constant = 5.0273361f;
        double ConversionRate = poundSterlings * dollarRate;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(poundSterlings + " Poundsterlings are equal to " + ConversionRate + " dollars");
        System.out.println(String.format("%.0f", poundSterlings)
        + " poundsterlings are equal to "
        + df.format(ConversionRate)
        + " dollars");



    }
}
