public class Exercise4 {
    public static void main(String[] args) {
        String myPassword = "Password";
        System.out.println(myPassword.replaceAll("[A-Z][a-z].{0,15}", "12345678"));
    }
}
