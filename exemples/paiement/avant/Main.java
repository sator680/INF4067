package inf4067.solid.exemples.paiement.avant;

// Diapo 3 : utilisation
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("mobil_pay", 1500);
        processor.processPayment("credit_card", 6500);
        processor.processPayment("paypal", 4500);
    }
}
