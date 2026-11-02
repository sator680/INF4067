package inf4067.solid.srp.apres;

// [Ajouté] Classe absente du support, ajoutée pour que le code compile et s'exécute.

public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");
        BookPrinter printer = new BookPrinter();
        printer.printToScreen(book);
        printer.printToHTML(book);
        new BookSaver().saveToDatabase(book);
        new BookBusinessLogic().emprunter(book, "Marcial");
    }
}
