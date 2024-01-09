public class Car {
    private String model;
    private int year;

    Engine engine;

    public Car(String model,int year, Engine engine){
        this.model=model;
        this.year=year;
        this.engine=engine;
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
        if(obj==null || obj.getClass()!=getClass())return false;
        Car other = (Car) obj;
        return model.equals(other.model) && year== other.year && engine.equals(other.engine);
    }
}
