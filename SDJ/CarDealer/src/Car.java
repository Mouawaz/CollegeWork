public class Car {
    private String make;
    private String model;
    private int year;

    private Engine engine;
    public Car(String make, String model, int year){
        this.make=make;
        this.model = model;
        this.year=year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass()!=getClass())
            return false;
        Car other = (Car) obj;
        return make.equals(other.make)&&model.equals(other.model)&&year==other.year&& engine.equals(other.engine);
    }
}

