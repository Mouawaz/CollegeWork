public class Main {
    public static void main(String[] args) {
        BurgerBar burgerBar = new BurgerBar(100);
        BurgerBarEmployee burgerBarEmployee;

        BurgerBarCustomer c1 = new BurgerBarCustomer("User1",burgerBar, 10);
        BurgerBarCustomer c2 = new BurgerBarCustomer("User2",burgerBar, 10);
        BurgerBarCustomer c3 = new BurgerBarCustomer("User3",burgerBar, 10);
        BurgerBarCustomer c4 = new BurgerBarCustomer("User4",burgerBar, 10);

        BurgerBarEmployee e1 = new BurgerBarEmployee("Luca", burgerBar);

        Thread C1 = new Thread(c1);
        Thread C2 = new Thread(c2);
        Thread C3 = new Thread(c3);
        Thread C4 = new Thread(c4);

        Thread E1 = new Thread(e1);

        C1.start();
        C2.start();
        C3.start();
        C4.start();
        E1.start();
    }
}