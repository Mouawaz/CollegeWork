public class Van extends Car{
    private int capacity;

    public Van(String licenseNo, Double price, int capacity){
        super(licenseNo,price);
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    public String getType(){
        return "Van";
    }
}
