public abstract class Camera {

    Manufacturer manufacturer;
    public Camera(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public abstract void takeAPicture();
}
