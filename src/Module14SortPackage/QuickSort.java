package Module14SortPackage;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] a, int start, int end){

        if (start < end ) return;
        int pivot = partition(a, start, end);
        quickSort(a, start, pivot);
        quickSort(a,pivot+1, end);
    }

    public static int partition(int[] a, int start, int end) {
        int pivot = a[start];
        int i = start;
        for (int j = start; j < a.length; end--) {
            if (a[j] < pivot) {
                int temp = a[i];
                a[i] = a[end];
                a[end] = temp;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int []number = {24, 35, 56, 10, 40, 20, 57, 80, 90, 130, 5};
        System.out.println("Before the array is sorted: " + Arrays.toString(number));
        quickSort(number,0, number.length-1);
        System.out.println("After the array is sorted: " + Arrays.toString(number));
    }
}
