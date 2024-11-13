package Herança;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Herança {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Account> list = new ArrayList();

        list.add(new SavingsAccount(1001, "Alex" , 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria" , 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Anna" , 500.0, 500.0));
        Double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance %.2f%n" , sum);

        for (Account acc : list){
            acc.deposite(10.0);
        }

        for (Account acc : list){
            System.out.printf("Updated balance for account: %d %.2f%n " , acc.getNumber(),acc.getBalance() );
        }
       //Account acc1 = new Account(1001, "Henrique", 1000.0);
        //BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING

        // Account accCasting = bacc;
        // acc1.getBalance();

        //Account acc26 = new BusinessAccount(1003, "bob", 0.0 , 500.0);
        //Account acc3 = new SavingsAccount(1004, "Anan", 0.0, 0.01);

        //DOWNCASTING

        //BusinessAccount acc4 = (BusinessAccount) acc26;
        //acc4.loan(100.0);

        // Error : BusinessAccount acc5 = (BusinessAccount) acc3;

       // if (acc3 instanceof BusinessAccount){
       //     BusinessAccount acc5 = (BusinessAccount)acc3;
       //     System.out.println("Loan!");
        //}

       // if (acc3 instanceof SavingsAccount){
       //     SavingsAccount acc5 = (SavingsAccount) acc3;
       //     acc5.updateBalance();
        //    System.out.println("Update!");
        //}

       // Account acc2 = new SavingsAccount();
       // acc1.withDraw(200.0);

        //System.out.println(acc1.getBalance());

       // acc2.withDraw(200.0);

       // System.out.println(acc2);
    }
}
