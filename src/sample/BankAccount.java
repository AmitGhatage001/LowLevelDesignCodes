package sample;

public class BankAccount {
    String accountNumber;
    int balance;
    double roi;

    double getSimpleInterest(int time){
        double ans = (double)(balance * roi * time)/100;
        return ans;
    }
    double getBalanceWithInterest(int time){
        double interest = getSimpleInterest(time);
        return balance + interest;
    }

}
