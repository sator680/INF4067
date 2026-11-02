package inf4067.solid.exemples.paiement.apres;

// Diapo 17 : dépend de l'abstraction PaymentMethod, injectée par le constructeur
public class PaymentProcessor2 {
    private PaymentMethod paymentMethod;

    public PaymentProcessor2(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}
