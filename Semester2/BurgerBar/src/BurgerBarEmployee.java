public class BurgerBarEmployee implements Runnable{

    private String name;
    BurgerBar burgerBar;

    public BurgerBarEmployee(String name){
        this.name=name;

    }


    @Override
    public void run() {
        burgerBar.makeBurger(name);
        System.out.println("burger cooked by " + name);
        System.out.println("total number of burgers" + burgerBar.getNumberOfBurgers());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
