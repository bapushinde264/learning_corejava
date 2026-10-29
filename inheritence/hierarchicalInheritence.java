package inheritence;

public class hierarchicalInheritence {
    public static void main(String[] args) {

        CurrentAccount obj = new CurrentAccount();

        SavingAccount obj2 = new SavingAccount();
        obj.accountHolderName = "Bapu Shinde";
        obj.balance = 1000;
        obj.overdraftlimit = 1000;

        obj.withdraw(2000);

        obj.accountHolderName = "Bapu";
        obj2.balance = 1500;
        obj2.intrestRate = 5;
        obj2.applyInterest();

    }

}

class Account {

    String accountHolderName;
    double balance;

    void deposite(double amount) {

        balance += amount; // balance = balance + amount;

        System.out.println(
                "Deposited " + amount + " " + "in" + " " + accountHolderName + " " + "account.New balance is "
                        + balance);

    }

}

class SavingAccount extends Account {
    double intrestRate;

    void applyInterest() {

        double intrest = balance * intrestRate / 100;
        balance += intrest;

        System.out.println(
                "Deposited " + intrest + " " + "in" + " " + accountHolderName + " " + "account.New balance is "
                        + balance);

    }

}

class PremiumSavingAccount extends SavingAccount {

    double cashbackRate;

    void applyCashback() {

        double cashback = balance * cashbackRate / 100;
        balance += cashback;
        System.out.println("Deposite" + cashback + "in :" + accountHolderName + "accont,New Balance is:" + balance);

    }
}

class CurrentAccount extends Account {

    double overdraftlimit;

    void withdraw(double amount) {

        if (amount <= overdraftlimit + balance) {
            balance -= amount;

            System.out.println(accountHolderName + "account. New balance is " + balance);

        } else {
            System.out.println("Overdraft limit exceed!!");
        }

    }

}
