public abstract class DigitalCamera extends Camera{
    private double megapixels;
    ImageDirectory imageDirectory;

    public DigitalCamera(Manufacturer manufacturer, double megapixels, int maxNumberOfImages){
        super(manufacturer);
        this.megapixels=megapixels;
        new ImageDirectory(maxNumberOfImages);
    }

    @Override
    public void takeAPicture() {
    }

    public void addDescriptionToLastPicture(String description){
        imageDirectory.getImage(imageDirectory.getNumberOfImages()).setDescription(description);
    }

    public ImageDirectory getImageDirectory() {
        return imageDirectory;
    }
}
