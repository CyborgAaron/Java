package Module8.AccountExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private int id;
    private double balance=5;
    private double annualInterestRate = 0;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
    Date dateCreated = new Date();


    //Constructor
    Account() {

    }

    public int getId() {
//        System.out.println(id);
        return id;
    }

    public double getBalance() {
//        System.out.println(balance);
        return balance;
    }

    public double getAnnualInterestRate() {
//        System.out.println(annualInterestRate);
        return annualInterestRate;
    }

    public Account(int id, double balance) {

    }

    public void setId(int id1) {
        id = id1;
    }

    public void setBalance(double balance1) {
        balance = balance1;
    }

    public void setAnnualInterestRate( double annualInterestRate1) {
        annualInterestRate = annualInterestRate1/100;
    }

    public Date getDateFormat(){
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest() {
        return balance * annualInterestRate/12;
    }

    public void withdraw(double amount) {
        balance -= amount;
}

    public void  deposit(double amount) {
        balance += amount;
    }

}
