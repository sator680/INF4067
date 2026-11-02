package inf4067.solid.couplage.apres;

// Diapo 19 : implémentation concrète interchangeable
public class MysqlDatabase implements BaseDeDonnees {
    public void executer(String requete) {
        System.out.println("Exécution MySQL : " + requete);
    }
}
