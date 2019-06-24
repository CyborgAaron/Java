package Module14SortPackage;

import java.util.Arrays;

public class BucketSort {

    public static void sort(int[] arr, int maxValue) {


        //Array but the max number is 9876+1 or 7+1
        int[] bucket = new int[maxValue+1];

        //There are 10 buckets in totally being looped through.
        for (int i = 0; i< bucket.length; i++)
        {
            //Index for the array starts at 0
            bucket[i] = 0;
        }

        //bucket is then added to the array then incremented
        for (int i=0; i<arr.length; i++) {
            bucket[arr[i]]++;
        }
        //The array is then incremented through an empty list and nested
        int nullPostion = 0;
        for (int i = 0; i < bucket.length; i++)
            for (int j = 0; j < bucket[i]; j++)
            {
                arr[nullPostion++]=i;
            }

    }

    public static void main(String[] args) {
        //HardCoded numbers for the methods and number of buckets
        int maxValue = 7;
        int[] data = {5,3,7,2,3,1};
//        int maxValue = 9876;
//        int[] data = {25, 777, 863, 9876, 1, 1230, 56};
        //Prints out the array before and after being sorted
        System.out.println("Before the array is sorted: " + Arrays.toString(data));
        sort(data, maxValue);
        System.out.println("After the array is sorted: " + Arrays.toString(data));
    }
}
