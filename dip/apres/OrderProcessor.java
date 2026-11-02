package inf4067.solid.dip.apres;

// Diapo 43 : dépend de l'abstraction Database, injectée par le constructeur
public class OrderProcessor {
    private Database database;

    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder(String order) {
        database.save(order);
    }
}
