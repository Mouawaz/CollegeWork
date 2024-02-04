import java.util.ArrayList;

public class CarDealer {
    private String name;
    private ArrayList<Car> cars;

    public CarDealer(String name) {
        this.name = name;
        cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void sellCar(Car car) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).equals(car))
                cars.remove(i);
        }
    }

    public int getNumberOfCars() {
        return cars.size();
    }

    public int getNumberOfCarsByMake(String make) {
        int a = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getMake() == make) a++;
        }
        return a;
    }

    public Car[] getCarsByMake(String make) {
        Car[] carz = new Car[cars.size()];
        int a = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getMake() == make) {
                carz[a] = cars.get(i);
                a++;
            }
        }
        return carz;
    }

    public double getAverageEngineSize() {
        double t = 0;
        for (int i = 0; i < cars.size(); i++) {
            t += cars.get(i).getEngine().getSize();
        }
        return t / cars.size();
    }

    public SportsCar getFastestSportsCar() {
        SportsCar currentMax = new SportsCar(null,null,0,0);
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) instanceof SportsCar && currentMax.getSpeed() < ((SportsCar) cars.get(i)).getSpeed())
                currentMax = (SportsCar) cars.get(i);
        }
        return currentMax;
    }

    public SportsCar[] getAllSportsCars() {
        SportsCar[] carz = new SportsCar[cars.size()];
        int a = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) instanceof SportsCar) carz[a] = (SportsCar) cars.get(i);
            a++;
        }
        return carz;
    }

}
