package Module14SortPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method4Sorting {

    public static void main(String[] args) {
        int[] input = {5, 7, 0, 2, 4, 1230, 1, 0, 6, 2, 3, 1, 4, 3, 120, 16, 17};
        int maxValue = 1230;
//        int[] highInput = {1230, 120};
        //Prints out the array before and after being sorted
        System.out.println("Before the array is sorted: " + Arrays.toString(input));
//        sortingOfNumbers(input, maxValue);
        System.out.println("After the array is sorted: " + Arrays.toString(input));

    }

    public static void sortingOfNumbers(int[] input)
    {

        final int RADIX = 10;

        // declare and initialize bucket[]
        List<Integer>[] bucket = new ArrayList[RADIX];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }
    }

}
