import java.util.ArrayList;

public class PizzaOrder {
    private Customer customer;
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public void PizzaOrder(Customer customer){
    this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
    public int getNumberOfPizzas(){
        return pizzas.size();
    }
    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }
    public Pizza getPizza(int index){
        return pizzas.get(index);
    }
    public Pizza getPizza(String pizzaName){
        for (int i = 0; i < pizzas.size(); i++) {
            if(pizzas.get(i).equals(pizzaName))
                return pizzas.get(i);
        }
        return null;
    }

    private double getTotalPrice(){
        double total = 0;
        for (int i = 0; i < pizzas.size(); i++) {
            total+=pizzas.get(i).getGetTotalPrice();
        }
        return total;
    }
}
