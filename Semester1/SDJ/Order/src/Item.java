public class Item {
    private String name;
    private double price;

    public Item(String name, double price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || obj.getClass() != getClass())
            return false;
        Item other = (Item) obj;
        return name.equals(other.name) && price == other.price;
    }

    public String getInfo(){
        return "Name: " + name + ";" + "Price: " + price;
    }

}
