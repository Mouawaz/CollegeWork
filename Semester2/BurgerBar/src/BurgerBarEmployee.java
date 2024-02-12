public class BurgerBarEmployee implements Runnable {

    private String name;
    private BurgerBar burgerBar;

    public BurgerBarEmployee(String name, BurgerBar burgerBar) {
        this.name = name;
        this.burgerBar = burgerBar;
    }



    @Override
    public void run() {
        while (Thread.activeCount() > 2) {
            burgerBar.makeBurger(name);
            System.out.println("burger cooked by " + name);
            System.out.println("***total number of burgers " + burgerBar.getNumberOfBurgers() + "***");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}