package inf4067.solid.couplage.avant;

import java.util.List;

// Diapo 18 : mauvais design (faible cohésion, fort couplage)
public class Commande {
    private List<Double> prixItems;
    private double total;

    public Commande(List<Double> prixItems) {
        this.prixItems = prixItems;
    }

    // BON : Logique métier propre à la commande
    public void calculerTotal() {
        this.total = prixItems.stream().mapToDouble(Double::doubleValue).sum();
    }

    // MAUVAIS : Faible cohésion (mélange métier et technique)
    // MAUVAIS : Fort couplage (figé sur MySQL, impossible de changer facilement)
    public void sauvegarderDansBaseMysql() {
        MysqlConnection connexion = new MysqlConnection("localhost", "root", "password");
        String requete = "INSERT INTO commandes (total) VALUES (" + this.total + ")";
        connexion.executerRequete(requete);
    }
}
