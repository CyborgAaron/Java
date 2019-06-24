package Module14SortPackage;

import java.util.*;

public class ModuleSorting {
    public static void main(String[] args) {
        int[] unsortedData = {331, 454, 230, 34, 343, 454, 59, 453, 345, 231, 9};
        int[] container = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


//        container[0] = new ArrayList<Integer>()
//        ArrayList[container];
        List<Integer> contained = new ArrayList<>();
        contained.add(0);
        contained.add(1);
        contained.add(2);
        contained.add(3);
        contained.add(4);
        contained.add(5);
        contained.add(6);
        contained.add(7);
        contained.add(8);
        contained.add(9);
//        ArrayList<Integer> unsort [container];

        //Creating an ArrayList form the other collectionss
        List<Integer> unsortedNumData = new ArrayList<>();
        unsortedNumData.add(331);
        unsortedNumData.add(454);
        unsortedNumData.add(230);
        unsortedNumData.add(34);
        unsortedNumData.add(343);
        unsortedNumData.add(454);
        unsortedNumData.add(59);
        unsortedNumData.add(453);
        unsortedNumData.add(345);
        unsortedNumData.add(231);
        unsortedNumData.add(9);

        Iterator<Integer> numbersIterator = unsortedNumData.iterator();
        while ( numbersIterator.hasNext()) {
            Integer num = numbersIterator.next();
            if (num % 10 == 0) {
                numbersIterator.remove();
            }
        }
        System.out.println(unsortedNumData);
//        container[i] = new ArrayList<Integer>();
    }
}
