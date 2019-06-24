package module3;

import java.util.Scanner;

public class SumDoubleArrayDemo {
    public static void main(String[] args) {
        double[] mylist = new double[9];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter " + mylist.length + " number: " );

        for (int i = 0; i < mylist.length; i++)
            mylist[i] = input.nextDouble();

            double total = 0;
            for (int j = 0; j < mylist.length; j++) {
                total += mylist[j];
            }
            System.out.println("The total is " + total);
        //used this to add on to the cake
    }
}
