import java.util.concurrent.Semaphore;

public class BurgerBar {
    private int numberOfBurgers;
    private int maxNumberOfBurgers;
    private Semaphore semaphore;

    public BurgerBar(int maxNumberOfBurgers){
        this.maxNumberOfBurgers=maxNumberOfBurgers;
        numberOfBurgers = 0;
    }
    public void makeBurger(String employeeName){
        numberOfBurgers+=4;
    }

    public void eatBurger(String who) throws InterruptedException {
        semaphore.acquire();
        numberOfBurgers--;
        System.out.println(who + " is eating a burger. Remaining burgers: " + numberOfBurgers);
    }

    public int getNumberOfBurgers() {
        return numberOfBurgers;
    }
}
