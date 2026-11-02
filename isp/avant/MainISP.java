package inf4067.solid.isp.avant;

// [Ajouté] Classe absente du support, ajoutée pour pouvoir exécuter l'exemple de la diapo 38.
public class MainISP {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.work();
        human.eat();

        Worker robot = new RobotWorker();
        robot.work();
        // RobotWorker est forcé d'implémenter eat() (violation de l'ISP)
        try {
            robot.eat();
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
