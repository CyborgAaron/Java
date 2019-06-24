package Module7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UserInputAndRemoveDups {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int dup = input.nextInt();

        int array[] = new int[dup];
        System.out.println("Enter the Element: ");
        for (int size = 0; size < array.length; size++) {
            array[size] = input.nextInt();
        }

        Arrays.sort(array);
        int return_value = removeDuplicat(array, array.length);
        System.out.println("Sorted Array after removed Duplicate Elements:");
        for (int i = 0; i<return_value; i++) {
            System.out.println(array.toString()/*array[i] + " "*/);
        }

        //create an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        //shows the printed ArrayList with duplicates removed
//        System.out.println("Dups begone: "+ ""/*newList*/);
//
        //prompt the user to
        System.out.println("Enter 10 nusmber: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());

        }

        //Displays in increasing Orders
        System.out.println(list.toString());
    }

    //Removal of the duplicated list printing it in another method
        public static int removeDuplicat(int array[], int dup) {
            if (dup == 0 || dup == 1) {
                return dup;
            }
            int temp = 0;
//            int j = 0;
            for(int i = 0; i < dup-1; i++) {
                if(array[i] != array[i+1]) {
                        array[temp++] = array[i];
                }
        }
            array[temp++] = array[dup-1];
            return temp;
    }

}
