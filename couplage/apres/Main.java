package inf4067.solid.couplage.apres;

// [Ajouté] Classe absente du support, ajoutée pour que le code compile et s'exécute.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Commande commande = new Commande(List.of(1500.0, 2500.0));
        CommandeRepository repository = new CommandeRepository(new MysqlDatabase());
        repository.sauvegarder(commande);
    }
}
