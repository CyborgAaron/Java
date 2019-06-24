package Module8.AccountExercise;

import java.util.Date;
import java.text.SimpleDateFormat;

public class GroupExercise11ObjectsAndClasses {
    private int id;
    private double balance=5;
    private double annualInterestRate = 0;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
    Date date = new Date();


    //Constructor
    public GroupExercise11ObjectsAndClasses() {

    }

    public int getId() {
        System.out.println(id);
        return id;
    }

     public double getBalance() {
         System.out.println(balance);
         return balance;
    }

    public double getAnnualInterestRate() {
        System.out.println(annualInterestRate);
        return annualInterestRate;
//        annualInterestRate = 0.0d;
    }


    public static void main(String[] args) {

        GroupExercise11ObjectsAndClasses Account1 = new GroupExercise11ObjectsAndClasses();
        Account1.getBalance();
        Account1.getId();
        Account1.getAnnualInterestRate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
        Date date = new Date();
        System.out.println(dateFormat.format(date));


    }









}
