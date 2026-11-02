package inf4067.solid.dip.apres;

// Diapo 43
public class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}
