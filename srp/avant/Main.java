package inf4067.solid.srp.avant;

// Diapo 24 : utilisation de la classe Book
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Les principes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");
        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Marcial");
    }
}
