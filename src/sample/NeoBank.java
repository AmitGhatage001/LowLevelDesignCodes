package sample;
import java.util.*;
public class NeoBank extends BankAccount {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.accountNumber="1121344312";
        obj.balance=450000;
        obj.roi=3;
        System.out.println("After one year interest received ="+ obj.getSimpleInterest(1));
        System.out.println("Total Balance = "+ obj.getBalanceWithInterest(1));
        double interest=obj.getSimpleInterest(1);
        interest = interest / 4;
        System.out.println(interest);
    }

}
