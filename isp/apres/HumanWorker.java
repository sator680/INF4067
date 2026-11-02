package inf4067.solid.isp.apres;

// Diapo 39
public class HumanWorker implements Eatable {
    @Override
    public void work() {
        System.out.println("Les humains travaillent");
    }

    @Override
    public void eat() {
        System.out.println("Les humains mangent");
    }
}
