public class WeighedItem extends Item{
    private double weight;

    public WeighedItem(String name, double price,double weight){
        super(name,price);
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || obj.getClass()!= getClass())
            return false;
        Item other = (Item) obj;
        return getName().equals(other.getName())&&getPrice()==other.getPrice();
    }
    public String getInfo(){
        return "; Name: "+ getName() + "; Price: " +getPrice() + "; Weight: "+getWeight();
    }
}
