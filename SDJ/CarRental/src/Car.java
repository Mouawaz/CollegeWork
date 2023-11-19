import java.lang.ref.SoftReference;

public class Car {

    private Customer rentedTo;
    private String licenseNo;
    private double price;

    public void Car(String licenseNo,double price){
        this.licenseNo=licenseNo;
        this.price=price;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getRentedTo() {
        return rentedTo;
    }

    public void setRentedTo(Customer rentedTo) {
        this.rentedTo = rentedTo;
    }
    public boolean isAvailable(){
        return rentedTo == null;
    }
}
