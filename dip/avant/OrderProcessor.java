package inf4067.solid.dip.avant;

// Diapo 42 : viole le DIP (crée lui-même une classe concrète de bas niveau)
public class OrderProcessor {
    private MySQLDatabase database;

    public OrderProcessor() {
        this.database = new MySQLDatabase();
    }

    public void processOrder(String order) {
        database.save(order);
    }
}
