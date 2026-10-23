package inheritence;

public class multilevelInheritence {
    public static void main(String[] args) {

        SavingAccount obj = new SavingAccount();
        obj.accountHolderName = "Bapu Shinde";
        obj.balance = 1000;

        obj.deposite(1500);
        obj.intrestRate = 5;
        obj.applyInterest();

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
