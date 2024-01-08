import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {

    private ArrayList<OrderLine> orderLines;

    public Order(){
        orderLines = new ArrayList<>();
    }
    public void addProduct(Item item, int amount){
        orderLines.add(new OrderLine(item, amount));
    }

    public int getNumberOfOrderLines(){
        return orderLines.size();
    }

    public double getTotalPrice(){
        double a=0;
        for (int i = 0; i < getNumberOfOrderLines(); i++) {
            a+=orderLines.get(i).getItem().getPrice()*orderLines.get(i).getAmount();
        }
        return a;
    }

    public Item getOrderItem(int orderLineIndex){
        return orderLines.get(orderLineIndex).getItem();
    }

    public int getAmountOfOrderItem(int orderLineIndex){
        return orderLines.get(orderLineIndex).getAmount();
    }

    public double getTotalWeighedForWeighedItems(){
        double a =0;
        for (int i = 0; i < orderLines.size(); i++) {
            if(orderLines.get(i).getItem() instanceof WeighedItem)
                a+=((WeighedItem) orderLines.get(i).getItem()).getWeight();
        }
        return a;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderLines=" + orderLines +
                '}';
    }
}
