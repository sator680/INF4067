package inf4067.solid.dip.apres;

// Diapo 43
public class MongoDBDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}
