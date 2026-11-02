package inf4067.solid.exemples.paiement.apres;

// [Ajouté] Classe absente du support, ajoutée pour que le code compile et s'exécute.
// (utilisée dans le Main de la diapo 17, code non montré)
public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: " + amount + " CFA");
    }
}
