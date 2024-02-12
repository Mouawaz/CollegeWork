public class BurgerBarCustomer implements Runnable{
    private int burgersToEat;
    private String name;
    BurgerBar burgerBar;

    public BurgerBarCustomer(String name, BurgerBar burgerBar, int burgersToEat){
        this.name=name;
        this.burgerBar=burgerBar;
        this.burgersToEat=burgersToEat;
    }

    @Override
    public void run() {
        for (int i = 0; i < burgersToEat; i++) {
            try {
                burgerBar.eatBurger(name);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("burger eaten by " + name +" ** REMAINING:" + burgerBar.getNumberOfBurgers());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
