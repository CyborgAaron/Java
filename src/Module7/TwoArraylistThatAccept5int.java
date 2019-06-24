package Module7;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoArraylistThatAccept5int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Decimals: ");

        //create an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Creating second ArrayList
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        //Prompt the user to enter two lists
        //each with five integers
        System.out.println("Enter five integers for list1");
        System.out.println("Enter five integers for list2");
        //Combined Lists
        ArrayList<Integer> list3 = union(list, list2);

        System.out.println("The combined list is: ");
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }
        System.out.println();
//        list.addAll(list2);
        //1prompt the user to
//    }
    }



    public static ArrayList<Integer> union(ArrayList<Integer> list1,
                                           ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = list1;
            for (int i = 0; i < list2.size(); i++) {
                list3.add(list2.get(i));
            }
            return list3;
        }

}
