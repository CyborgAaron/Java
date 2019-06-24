package Module14SortPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Method2InsertionSort {
//    ************************8Bubble Sort of sorting an array ****************
//    void bubbleSort(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++)
//            for (int j = 0; j < n-i-1; j++)
//                if (arr[j] > arr[j+1])
//                {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//    }
//
//    void printArray(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 0; i<n; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//
//        Method2InsertionSort ob = new Method2InsertionSort();
//        int arr[] = {1,9,4,6,5,-4};
//        ob.bubbleSort(arr);
//        System.out.print("Array sorted: ");
//        ob.printArray(arr);
//    }


    public static void main(String[] args) {
        int[] m2 = {1, 9, 4, 6, 5, -4};
        boolean kol = true;
        int temp;
        for (int i = 0; i <= m2.length - 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (m2[j] > m2[j + 1]) {
                    //swap
                    temp = m2[j];
                    m2[j] = m2[j + 1];
                    m2[j + 1] = temp;
                }

            }

        }
        for (int i = 0; i < m2.length; i++) {
            System.out.println(m2[i] + " ");
            //System.out.println("sUMMARY O " + m2[j] +" "+ m2[j+i]);
        }

    }
}
