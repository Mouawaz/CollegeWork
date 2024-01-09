public class SportsCar extends Car{
    private int speed;

    public SportsCar(String model, String make, int year, int speed){
        super(make, model, year);
        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass()!=getClass())
            return false;
        SportsCar other = (SportsCar) obj;
        return speed== other.speed;
    }

}
