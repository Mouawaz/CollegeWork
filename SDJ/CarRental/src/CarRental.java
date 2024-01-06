import java.util.ArrayList;

public class CarRental {
    private String companyName;
    private String adress;
    ArrayList<Car> cars;
    public CarRental(String companyName,String adress){
        this.companyName=companyName;
        this.adress=adress;
        cars = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAdress() {
        return adress;
    }
    public int getNumberOfCars(){
        return cars.size();
    }
    public Car getCar(int index){
        return cars.get(index);
    }
    public void addCar(Car car){
        cars.add(car);
    }

    public Car getCarByLicence(String licenseNo){
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).getLicenseNo()==licenseNo) return cars.get(i);
        }
        return null;
    }

    public Car getAvailableSportsCar(){
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).getType()=="Sports")
                return cars.get(i);
        }
        return null;
    }
    public Car getAvailableVanCar(){
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).getType()=="Van")
                return cars.get(i);
        }
        return null;
    }
}
