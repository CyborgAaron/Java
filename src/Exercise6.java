import java.text.DecimalFormat;
//If else statements Books Discount
public class Exercise6 {
    public static void main(String[] args) {
        int NumOfBooks = 30;
        double bookPrice = 4.56d;
        int quotient = NumOfBooks / 3;
        double discount = 0d;
        //Double appliedDiscountforOver20Books =  0.1d;

        DecimalFormat df = new DecimalFormat("£ #,###.00");

        if (NumOfBooks <= 19) {
            discount = 0.01d * quotient;
        } else {
            discount = 0.1d + (0.01d * quotient);
            if (discount >= 0.4) {
                discount = 0.4d;
            }
        }
      System.out.println("Number of books\t\t: "
      + String.format("%,d,",NumOfBooks));
        System.out.println("Price before discount\t: "
        + df.format(bookPrice * NumOfBooks));
        System.out.println("discount\t\t: "
        + String.format("%.0f", (discount*100))
        + "%");
        System.out.println("Price after discount\t: "
        + df.format((1-discount) * (bookPrice * NumOfBooks)));
    }
}
