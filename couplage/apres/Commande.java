package inf4067.solid.couplage.apres;

import java.util.List;

// Diapo 19 : cette classe ne gère QUE les données de la commande
public class Commande {
    private List<Double> prixItems;

    public Commande(List<Double> prixItems) {
        this.prixItems = prixItems;
    }

    public double getCalculerTotal() {
        return prixItems.stream().mapToDouble(Double::doubleValue).sum();
    }
}
