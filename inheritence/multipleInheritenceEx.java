package inheritence;

public class multipleInheritenceEx {
    public static void main(String[] args) {

        smartAccount Ac = new smartAccount();
        Ac.deposite(1000);

    }

}

interface AccountOperation {
    void deposite(double amount);
}

interface LoanOperation {
    void applyLoan(double amount);
}

class smartAccount implements AccountOperation, LoanOperation {
    String accountHolderName;
    double balance;

    public void deposite(double amount) {

        System.out.println("Before deposite:" + balance);
        balance += amount;
        System.out.println("After deposite:" + balance + "  " + "Deposited Ammount is:" + amount);
    }

    public void applyLoan(double amount) {
        balance += amount;
        System.out.println("Loan Approved: " + amount + ". New balance: " + balance);
    }
}
