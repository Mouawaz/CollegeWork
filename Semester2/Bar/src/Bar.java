import java.util.ArrayList;

public class Bar {
     private ArrayList<Beer>[] beers;

    private int numberOfHeldBeers;

    public Bar() {
        this.beers = new ArrayList[]{null} ;
    }

    public void placeBeer(Beer b) throws InterruptedException {
        if(beers.length>20){
            wait(1500);
        }
        notifyAll();
    }
    public void takeBeer(){
    beers.
    }
}
