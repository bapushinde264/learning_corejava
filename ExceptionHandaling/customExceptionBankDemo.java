package ExceptionHandaling;

class InsuffcientBalanceException extends Exception {
    public InsuffcientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    int balance = 50000;

    void withdraw(int amount) throws InsuffcientBalanceException {
        if (amount > balance) {
            throw new InsuffcientBalanceException("Insufficient balance");

        }
        balance = balance - amount;

        System.out.println("withdrawal succesfull");
        System.out.println("Remaining Balance: " + balance);
    }
}

public class customExceptionBankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(4000);
        } catch (InsuffcientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
