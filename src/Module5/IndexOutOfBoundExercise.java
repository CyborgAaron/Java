package Module5;

import java.util.Scanner;

public class IndexOutOfBoundExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = getArray();
        System.out.println("Enter the index of the array: ");

        try {
            System.out.println("The corresponding element value" + " is "
               + array[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of bounds. ");
        }
        input.close();
    }

    public static int[] getArray() {
        int[] array = new int [150];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100)+1;
            //enter in random integers through a for loop.
        }
        return array;
    }
}
