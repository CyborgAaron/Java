import java.util.Scanner;

public class PalindromeIntegerExercise {

//    public static void main(String[] args) {
//        int num1 = 2002;
//        boolean value = isPalindrome(num1);
//
//    }

    public static int reverse(int number) {
        String reverse = "";
        String n = number + "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        System.out.println("Return of the Palindrome" + Integer.parseInt(reverse));
        return  Integer.parseInt(reverse);
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
//        int return = reverse(number);
//        if (number += ) {
//
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer: ");
        int number = sc.nextInt();
        System.out.println(number + (isPalindrome(number) ? " is " : " is not a Palindrome") + "a plaindrome");
    }

}
