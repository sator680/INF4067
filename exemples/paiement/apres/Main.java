package inf4067.solid.exemples.paiement.apres;

// Diapo 17 : utilisation
public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentProcessor2 processor1 = new PaymentProcessor2(creditCard);
        processor1.processPayment(10000);

        PaymentMethod paypal = new PayPalPayment();
        PaymentProcessor2 processor2 = new PaymentProcessor2(paypal);
        processor2.processPayment(5000);
    }
}
