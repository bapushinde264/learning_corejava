package Encapsulation;

public class EncapsulationEx {
    public static void main(String[] args) {

        Myclass a1 = new Myclass("Bapu", 1000);
        a1.deposite(500);
        a1.withdraw(200);
    }
}

class Myclass {
    private double balance;
    private String AcHolder;

    Myclass(String AcHolder, double balance) {
        this.AcHolder = AcHolder;
        this.balance = balance;

    }

    public void deposite(double amount) {
        balance += amount;
        System.out.println("Current balace is:" + balance + "  " + "deposited:" + amount + " " + "in your Account");

    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println(
                "Current balace is:" + balance + "  " + "withdraw amount:" + amount + " " + "from your Account");

    }

}
