package Module7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDupArrayLeoVersion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your Decimals: ");

        //create an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        //prompt the user to
        System.out.println("Enter 10 nusmber: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        //Invoke removedup method
        removeDuplicate(list);


        //Display the distinct integers
        System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    //Remove the duplicate elements from an array list of integers
    public static void removeDuplicate(ArrayList<Integer> list) {
        boolean duplicateVal = true;
        while(duplicateVal == true) {
            duplicateVal = false;
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) == list.get(j))
                        list.remove(j);
                }
            }

        }

    }
}
