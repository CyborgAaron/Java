package Array;

public class SumAllElementsRowExercise {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();

        // To display the matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int row = 0; row < matrix.length; row++) {
            System.out.println("The sum of elements in row " + row + " is " + sumRow(matrix, row));
        }

    }

    //Get matrix creates athe matrix and sumRow sums the row. using a Forloop and methods to call the amin function(PSVM) to genereate a random
    public static int[][] getMatrix() {
        int[][] matrix = new int[3][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

// forLoop created to get the element of each colmun gathered from the sumRow
    public static int sumRow(int[][] matrix, int rowIndex) {
        int total = 0;

        //Add each element of the same column
        for (int column = 0; column < matrix[0].length; column++) {
            total += matrix[rowIndex][column];

        }
        return total;
    }

}


