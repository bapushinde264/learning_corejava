package PaymentGatewaywithInterface;

import java.util.Scanner;

public class usingabstraction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Select Payment Method: 1. Credit Card  2. UPI  3. Net Banking");

        int choice = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        IPayment payment;

        switch (choice) {

            case 1:
                System.out.println("Enter Credit Card Number:");
                String cardNumber = sc.nextLine();

                payment = new CreditCardPayment(cardNumber);
                break;

            case 2:
                System.out.println("Enter UPI ID:");
                String upiId = sc.nextLine();

                payment = new UpiPayment(upiId);
                break;

            case 3:
                System.out.println("Enter User ID:");
                String userId = sc.nextLine();

                payment = new NetBankingPayment(userId);
                break;

            default:
                System.out.println("Invalid Choice!");
                sc.close();
                return;
        }

        System.out.println("Enter Payment Amount:");
        double amount = sc.nextDouble();

        PaymentSrvice service = new PaymentSrvice(payment);

        service.executePayment(amount);

        sc.close();
    }
}

abstract class IPayment {

    abstract void paymentProcess(double amount);

    abstract void generateReceipt();
}

class CreditCardPayment extends IPayment {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void paymentProcess(double amount) {
        System.out.println(
                "Processing card payment of Rs. " + amount
                        + " using card number: " + cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit Card Payment Receipt Generated");
    }
}

class UpiPayment extends IPayment {

    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void paymentProcess(double amount) {
        System.out.println(
                "Processing UPI payment of Rs. " + amount
                        + " using UPI ID: " + upiId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI Payment Receipt Generated");
    }
}

class NetBankingPayment extends IPayment {

    private String userId;

    public NetBankingPayment(String userId) {
        this.userId = userId;
    }

    @Override
    public void paymentProcess(double amount) {
        System.out.println(
                "Processing Net Banking payment of Rs. " + amount
                        + " using User ID: " + userId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Net Banking Payment Receipt Generated");
    }
}

class PaymentSrvice {

    private IPayment payment;

    public PaymentSrvice(IPayment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.paymentProcess(amount);
        payment.generateReceipt();
    }
}
