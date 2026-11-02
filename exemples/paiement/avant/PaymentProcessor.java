package inf4067.solid.exemples.paiement.avant;

// Diapo 3 : version initiale (un seul PaymentProcessor gère tous les modes)
public class PaymentProcessor {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("mobil_pay")) {
            System.out.println("Processing mobile payment: " + amount + " CFA");
            // Logique spécifique aux payements mobiles
        } else if (paymentType.equals("credit_card")) {
            System.out.println("Processing credit card payment: " + amount + " CFA");
            // Logique spécifique aux cartes bancaires
        } else if (paymentType.equals("paypal")) {
            System.out.println("Processing PayPal payment: " + amount + " CFA");
            // Logique spécifique à PayPal
        } else if (paymentType.equals("crypto")) {
            System.out.println("Processing crypto payment: " + amount + " CFA");
            // Logique spécifique aux crypto-monnaies
        }
    }
}
