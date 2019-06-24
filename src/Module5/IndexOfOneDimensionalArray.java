package Module5;

public class IndexOfOneDimensionalArray {
    public static void main(String[] args) {
        int[] arrayBounds = new int[5];

        //Wrong method
        //initialise each value in the array
        for (int i = 0; i < 5; i++) arrayBounds[i] = 5 - i;

        int sumAll = arrayBounds[0] + arrayBounds[3];
//        System.out.println("OUT OF BOUNDS");


        if (sumAll <= 10) {
            System.out.println("Out Of bounds");
            System.out.println("Your Current Number: " + arrayBounds);
        }
    }
}
