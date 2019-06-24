package Array;

public class Exercise2 {

    public static void main(String[] args) {
        int[][] WeeklyStudy = {

                //Numbers added in for the  weekly hours studied
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 4, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};

        // To display the matrix
        sortRow(sumRow(WeeklyStudy, 0));
    }

    public static int[][] sumRow(int[][] matrix, int rowIndex) {

        int[]a = new int[8];
        int total = 0;

        //Add each element of the same column
        for (int column = 0; column < matrix[0].length; column++) {
            a[column] = total + matrix[rowIndex][column];
        }
        int[][] totalMatirx = new int[matrix.length][2];
        for (int row = 0; row < matrix.length; row++) {
            totalMatirx[row][0] = row;
            for (int column = 0; column < matrix[0].length; column++) {
                totalMatirx[row][1] += matrix[row][column];
            }
        }
        return totalMatirx;
    }

    public static void sortRow(int[][] weeklyStudy) {

        System.out.println("Student         Weekly study hours");
        System.out.println("-----------------------------------");
        //creates the student and weekly hours provided,
        for (int row = 1; row < weeklyStudy.length; row++) {
            for ( int column = 1; column < weeklyStudy.length; column++) {
                    if (weeklyStudy[column-1][1] < weeklyStudy[column][1]) {
                        //swapping of elements & METHODS
                        int[] temp = weeklyStudy[column-1];
                        weeklyStudy[column-1] = weeklyStudy[column];
                        weeklyStudy[column] = temp;
                    }
            }
        }

        for (int row = 0; row < weeklyStudy.length; row++) {
            for (int column = 0; column < weeklyStudy[row].length; column++)
            {
                //sPACE NEEDED to create the table for the week and students.
                System.out.print("  " + weeklyStudy[row][column] + "            ");
            }
                System.out.println();
            }

    }



//

}
