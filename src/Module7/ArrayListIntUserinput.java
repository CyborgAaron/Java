package Module7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntUserinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Decimals: ");

        //create an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        //prompt the user to
        System.out.println("Enter 5 nusmber: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        //Sort Numbers
        sort(list);

        //Displays in increasing Orders
        System.out.println(list.toString());

        //Display Decrease Order

    }

    public static void sort(ArrayList<Integer> list) {

        //Sort them into order
        java.util.Collections.sort(list);

        //Reverse of the index
        java.util.Collections.reverse(list);
    }
}
