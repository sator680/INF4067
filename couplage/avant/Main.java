package inf4067.solid.couplage.avant;

import java.util.List;

// [Ajouté] Classe absente du support, ajoutée pour pouvoir exécuter l'exemple de la diapo 18.
public class Main {
    public static void main(String[] args) {
        Commande commande = new Commande(List.of(1500.0, 2500.0));
        commande.calculerTotal();
        // Commande gère elle-même sa sauvegarde, et uniquement sur MySQL (fort couplage)
        commande.sauvegarderDansBaseMysql();
    }
}
