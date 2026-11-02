package inf4067.solid.ocp.avant;

// Diapo 30 : viole l'OCP (il faut modifier la classe pour chaque nouvelle forme)
public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHeight();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        }
        throw new IllegalArgumentException("Unknown shape");
    }
}
