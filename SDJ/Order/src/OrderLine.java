public class OrderLine {
    private int amount;

    private Item item;
    public OrderLine(Item item, int amount){
        this.item=item;
        this.amount=amount;
    }

    public Item getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null || obj.getClass()!=getClass())
            return false;
        Item other = (Item) obj;
        return item.equals(other)&&getAmount()== other.getPrice();
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "amount=" + amount +
                ", item=" + item +
                '}';
    }
}
