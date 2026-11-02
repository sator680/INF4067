package inf4067.solid.exemples.paiement.apres;

// Diapo 16 : implémentation concrète
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount + " CFA");
    }
}
