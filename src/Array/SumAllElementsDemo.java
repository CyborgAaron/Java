package Array;

public class SumAllElementsDemo {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }

        //Add each element in a temp variable called total
        int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[row].length; column++) {
                    total += matrix[row][column];

                }
            }

            //display or show the MDA
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The sum of all elements " + total);
    }

}
