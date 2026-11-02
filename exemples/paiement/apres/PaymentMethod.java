package inf4067.solid.exemples.paiement.apres;

// Diapo 16 : interface commune pour tous les moyens de paiement
public interface PaymentMethod {
    void processPayment(double amount);
}
