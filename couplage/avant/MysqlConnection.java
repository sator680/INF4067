package inf4067.solid.couplage.avant;

// [Ajouté] Classe absente du support, ajoutée pour que le code compile et s'exécute.
// (utilisée par Commande à la diapo 18, code non montré)
public class MysqlConnection {
    public MysqlConnection(String hote, String utilisateur, String motDePasse) {
        System.out.println("Connexion MySQL à " + hote + " (" + utilisateur + ")");
    }

    public void executerRequete(String requete) {
        System.out.println("Exécution MySQL : " + requete);
    }
}
