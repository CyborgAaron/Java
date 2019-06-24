package Array;

public class NewExercise2 {
    public static void main(String[] args) {
        int[][] WeeklyStudy = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 4, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };
    }

//    public static int sortRow(int index[] int sum) {
//
//    }





    public static int sumRow(int[][] matrix, int rowIndex) {
        int total = 0;

        //Add each element of the same column
        for (int column = 0; column < matrix[0].length; column++) {
            total += matrix[rowIndex][column];

        }
        return total;
    }
}
