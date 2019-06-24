package Module9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {

    public static void main(String[] args) {

        int[] input = { 331, 454, 230, 789098, 34, 99876554, 343, 45, 59, 453, 345, 231, 9 };

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(input));

        // sorting array using radix Sort Algorithm
        radixSort(input);

        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(input));

    }

    public static void radixSort(int[] input) {

        final int RADIX = 10;

        // declare and initialize bucket[]
        List<Integer>[] bucket = new ArrayList[RADIX];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        // sort
        boolean maxLength = false;
        int tmp = -1, placement = 1;
        while (!maxLength) {
            maxLength = true;

            // split input between lists
            for (Integer i : input) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }

            // empty lists into input array
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    input[a++] = i;
                }
                bucket[b].clear();
            }

            // move to next digit
            placement *= RADIX;
        }
    }

}
