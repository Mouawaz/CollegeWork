public class ToiletBuilding implements PublicToilet{

    private Person person;
    public ToiletBuilding(){    }
    @Override
    public synchronized void stepIntoCabin() throws InterruptedException {

    }

    @Override
    public synchronized void leaveCabin() throws InterruptedException {

        notifyAll();
    }
}
