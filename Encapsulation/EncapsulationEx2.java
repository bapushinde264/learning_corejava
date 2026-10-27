package Encapsulation;

public class EncapsulationEx2 {

}

class BankAccount {

    private double balance;
    private String accountHolderName;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(balance);

        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        System.out.println(balance);
    }
}
