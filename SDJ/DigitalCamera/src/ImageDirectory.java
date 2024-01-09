public class ImageDirectory {
    private int numberOfImages;

    public Image[] images;

    public ImageDirectory(int maxSize){
        this.numberOfImages=0;
        images = new Image[maxSize];
    }

    public int getNumberOfImages() {
        return numberOfImages;
    }

    public void addImage(Image image){
        if(numberOfImages<images.length){
            images[numberOfImages]=image;
            numberOfImages++;
        }
    }
    public void addDescription(int index,String description){
        images[index].setDescription(description);
    }
    public void removeImage(int index){
        for (int i = index; i < numberOfImages; i++) {
            images[i]=images[i+1];
        }
    }
    public Image getImage(int index){
        return images[index];
    }
    public Image getImage(String description){
        for (int i = 0; i < numberOfImages; i++) {
            if(images[i].getDescription()==description)
                return images[i];
        }
        return null;
    }

}
