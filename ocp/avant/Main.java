package inf4067.solid.ocp.avant;

// [Ajouté] Classe absente du support, ajoutée pour pouvoir exécuter l'exemple de la diapo 30.
public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Aire du rectangle = " + calculator.calculateArea(new Rectangle(4, 3)));
        System.out.println("Aire du cercle = " + calculator.calculateArea(new Circle(2)));

        // Une forme non prévue : il faudrait MODIFIER AreaCalculator (violation de l'OCP)
        try {
            calculator.calculateArea("Triangle");
        } catch (IllegalArgumentException e) {
            System.out.println("Forme non gérée : " + e.getMessage());
        }
    }
}
