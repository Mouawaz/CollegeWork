import java.util.ArrayList;

public class Person {
    private String name;
    private SportsCar sportsCar;

    ArrayList<Car> cars;
    public Person(String name){
        this.name=name;
        cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCarsOwned(){
        return cars.size();
    }
    public void buyACar(Car car){
        cars.add(car);
    }
    public void sellACar(Car car){
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).equals(car)) cars.remove(i);
        }
    }
    public void registerAsSportsCarDriver(SportsCar car){
     sportsCar = car;
    }

    public boolean doYouOwnTheSportsCarYouDrive(){
        for (int i = 0; i < getNumberOfCarsOwned(); i++) {
            if(cars.get(i).equals(sportsCar)) return true;
        }
        return false;
    }

    public void sellTheOldestCarYouOwn(){
        int a=cars.get(0).getYear();
        int b=0;
        for (int i = 1; i < cars.size(); i++) {
            if(cars.get(i).getYear()<a) {
                a = cars.get(i).getYear();
                b=i;
            }
        }
        cars.remove(b);
    }
    public Car getOwnedCarWithLargestEngine(){
        int a=0;
        int b = 0;
        for (int i = 0; i < getNumberOfCarsOwned(); i++) {
            if(cars.get(i).getEngine().getSize()>a){
                a=cars.get(i).getEngine().getSize();
                b=i;
            }
        }
        return cars.get(b);
    }

}
