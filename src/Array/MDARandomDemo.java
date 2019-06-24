package Array;

public class MDARandomDemo {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }


}
