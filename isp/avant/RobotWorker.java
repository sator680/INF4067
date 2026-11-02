package inf4067.solid.isp.avant;

// Diapo 38 : forcé d'implémenter eat() qu'il ne peut pas honorer
public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Les Robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
        System.out.println("l'on ne doit pas faire manger un robot");
        throw new UnsupportedOperationException("Les Robots ne mangent pas");
    }
}
