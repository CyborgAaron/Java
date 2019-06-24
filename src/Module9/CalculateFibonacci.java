package Module9;

import java.util.Scanner;

public class CalculateFibonacci {
    static long called1 = 0;
    //static int count = 0;

    public static void main(String args[]) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for the Fibonacci number: ");
        int index = input.nextInt();

        // Find and display the Fibonacci number
        System.out.println(
                "Fibonacci number at index " + index + " is " + fib(index));

        System.out.println(" Number of times the method has been called " + index + numOfTimes(index) +
                " This has been counted " + called1);

        /*
        *  // Find and display the Fibonacci number
        System.out.println(
                "Fibonacci number at index " + index + " is " + fib(index));

         // Find how many times the method is called

        System.out.println("The fib method was called " + count + " times.");
        * */
    }


    /** The method for finding the Fibonacci number */
    public static long fib(long index) {
        if (index == 0) // Base case
            return 0;
        else if (index == 1) // Base case
            return 1;
        else  // Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
    }

    public static long numOfTimes(long called ) {
        long numOfFib = 0;
        if (called == 0)
            return 1;
        else //(called == 1)
        while(called1 < 4) {
            System.out.println("This has been called " + called1);
            called1++;
        }
            return called; //* numOfTimes(called++ - 1);
//        for ( int i = 0; i < numOfTimes(numOfFib); i++) {
//            numOfFib++;
//        }
//        return numOfTimes(called + 1) + numOfTimes(called * 2);
    }

   /* public static long fib(long index) {
        count++;
        if (index == 0) // Base case
            return 0;
        else if (index == 1) // Base case
            return 1;
        else  // Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
    }*/

}
