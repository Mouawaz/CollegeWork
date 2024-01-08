public class UnitItem extends Item{
    public UnitItem(String name, double price){
        super(name,price);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || obj.getClass() != getClass())
            return false;
        Item other = (Item) obj;
        return getName().equals(other.getName())&&getPrice()== other.getPrice();
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
