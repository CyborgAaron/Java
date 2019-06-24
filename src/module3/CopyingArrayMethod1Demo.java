package module3;

public class CopyingArrayMethod1Demo {
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 2, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        for (int target: targetArray) {
            System.out.println(target);
        }
    }
}
