public class BurgerBar {
    private int numberOfBurgers;
    private int maxNumberOfBurgers;

    public BurgerBar(int maxNumberOfBurgers){
        this.maxNumberOfBurgers=maxNumberOfBurgers;
        numberOfBurgers = 0;
    }
    public void makeBurger(String employeeName){
        numberOfBurgers+=4;
    }

    public void eatBurger(String who){
        numberOfBurgers--;
    }

    public int getNumberOfBurgers() {
        return numberOfBurgers;
    }
}
