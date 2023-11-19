public class FamilyCar extends Car{
    private int seats;

    public FamilyCar(String licenseNo,double price,int seats){
        Car(licenseNo,price);
        this.seats=seats;
    }
}
