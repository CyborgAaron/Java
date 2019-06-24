public class Exercise11 {
    public static void main(String[] args) {
        String myPassword = "Password12345";

        for ( int i = 1; i < myPassword.length(); i++) {
                System.out.print("*");
//            System.out.println(myPassword.replaceAll("[A-Z][a-z].{0,15}", "**************"));
        }
    }
}
