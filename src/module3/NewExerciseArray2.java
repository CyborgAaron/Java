package module3;

public class NewExerciseArray2 {
    public static void main(String[] args) {

    double[] myList = {1.11, 5.55, 2.22, 3.33, 5.55};
        double maxNumber = 0;
        double maxNum2 = 0;

        for (int i = 0; i < myList.length; i++) {
        if (maxNumber < myList[i]) {
            maxNumber = myList[i];
            maxNum2 = i;

        }

//        for (int i = 0; i >= myList.length; i--) {
//            if (maxNumber > myList[i]) {
//                maxNumber = myList[i];
//
//            }

        }System.out.println("The index is: " + maxNum2);
        System.out.println("The Maximum number is " + maxNumber);


        }

    }


