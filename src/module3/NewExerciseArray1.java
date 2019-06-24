package module3;

public class NewExerciseArray1 {
    public static void main(String[] args) {


        double[] myList = {72.21, 44.73, 15.86, 27.20, 16.47, 92.35, 50.91, 62.37, 38.19, 58.34};
        double maxNumber = 0;

        for (int i = 0; i < myList.length; i++) {
            if (maxNumber < myList[i]) {
                maxNumber = myList[i];
            }


        }System.out.println("The Maximum number is " + maxNumber);


    }
}
