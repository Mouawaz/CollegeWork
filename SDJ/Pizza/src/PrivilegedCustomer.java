public class PrivilegedCustomer extends Customer{
    private double discountPercentage;
    public PrivilegedCustomer(String name) {
        super(name);
    }

    public double getDiscount() {
        return discountPercentage;
    }

    public void setDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
