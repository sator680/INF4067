package inf4067.solid.isp.apres;

// Diapo 39
public class MainISP {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();

        RobotWorker robot = new RobotWorker();
        robot.work();
    }
}
