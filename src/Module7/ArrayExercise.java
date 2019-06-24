package Module7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Collection<Double> number = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Decimals: ");

        //create an ArrayList
        ArrayList<Double> list = new ArrayList<>();

        //prompt the user to
        System.out.println("Enter 5 number: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }
        System.out.println("Sum of list: " + sum(list));
    }
    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return (Math.round(sum*100)/100.00);

//        input.close();

    }
}
