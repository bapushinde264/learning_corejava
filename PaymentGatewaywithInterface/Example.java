package PaymentGatewaywithInterface;

public class Example {
    public static void main(String[] args) {
        CreditCardPayment obj = new CreditCardPayment("1234567890");
        // obj.cardNumber = "1234567890";
        obj.paymentProcess(100);
        obj.generateReceipt();

    }
}

interface IPayment {

    void paymentProcess(double amount);

    void generateReceipt();
}

class CreditCardPayment implements IPayment {

    String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void paymentProcess(double amount) {
        System.out.println("Processsing card payment of Rs: " + amount + " using card number:" + cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit card payment Reciept Generated");
    }

}

class UpiPayment {

}

class NetBankingPayment {

}

class PaymentService {

}
