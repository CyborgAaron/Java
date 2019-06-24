package Module8.AccountExercise;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //gets the set methods from the Account class
        Account Account1 = new Account();

        Account1.getAnnualInterestRate();



        Account1.setId(1122);
        Account1.setBalance(20_000);
        Account1.setAnnualInterestRate(4.5d);
        Account1.withdraw(2_500d);
        Account1.deposit(3_000d);
        // Prints out account
        System.out.println("            Account Statement           ");
        System.out.println("----------------------------------------");
        System.out.println("Account ID: " + Account1.getId());
        System.out.println("Date Created: " + Account1.dateCreated);
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println("Balance: £" + Account1.getBalance());
        System.out.println("Monthly interest: £" + decimalFormat.format(Account1.getMonthlyInterest()));



    }



}
