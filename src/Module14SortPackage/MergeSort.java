package Module14SortPackage;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        //This just prints out the Array from before to Afterwards
        int[] data = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before the array is sorted: " + Arrays.toString(data));
        mergeSort(data);
        System.out.println("After the array is sorted: " + Arrays.toString(data));
    }

    public static void mergeSort(int []arr) {
        if ( arr.length > 1) {
            int[] start = startArray(arr);
            int[] end = endOfArray(arr);

            mergeSort(start);
            mergeSort(end);

            merge(arr, start, end);

        }
    }

    public static int[] startArray(int[] arr) {
        int floor = arr.length / 2;
        int[] start = new int[floor];
        for (int i = 0; i < floor; i++) {
            start[i] = arr[i];
        }
        return start;
    }

    public static int[] endOfArray(int[] arr) {
        int floor = arr.length / 2;
        int floor2 = arr.length - floor;
        int[] end = new int[floor2];
        for (int i = 0; i < floor2; i++) {
            end[i] = arr[i + floor];
        }
        return end;
    }

    public static void merge(int[] start, int[] middle, int[] end) {
//       declare the Integer n1 & n2 to 0#
        int n1 = 0;
        int n2 = 0;

        for (int i = 0; i < middle.length; i++) {
            //
            if (n1 >= end.length ||(n1 < start.length && start[n1] <= end[n2]))
            {
                middle[i] = start[n1];
                n1++;
            } else {
                middle[i] = end[n2];
                n2++;
            }
        }

    }
}
