import java.util.ArrayList;

public class Pizza {
    ArrayList<Topping> toppings = new ArrayList<>();
    private String name;
    private double initialPrice;
    private int numberOfToppings;
    private final int maxNumberOfToppings = 5;

    public Pizza(String name, double initialPrice) {
        this.name = name;
        this.initialPrice = initialPrice;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void addToppings(Topping topping) {
        while (numberOfToppings < 5) {
            toppings.add(topping);
            numberOfToppings++;
        }
    }

    public double getGetTotalPrice() {
        double buffer=0;
        for (int i = 0; i < toppings.size(); i++) {
            buffer+=toppings.get(i).getPrice();
        }
        return initialPrice+buffer;
    }
}
