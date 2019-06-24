package module3;

public class PassBySharingDemo {
    public static void main(String[] args) {
        int[] a = {1,2};
        swapArray(a);
        System.out.println("Array is now: " + a[0] + " and " + a[1]);
    }
    public static void swapArray(int[] array) {

        //swaping
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
