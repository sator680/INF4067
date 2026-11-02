package inf4067.solid.ocp.avant;

// [Ajouté] Classe absente du support, ajoutée pour que le code compile et s'exécute.
// (utilisée par AreaCalculator à la diapo 30, code non montré)
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
