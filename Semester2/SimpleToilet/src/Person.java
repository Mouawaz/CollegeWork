public class Person implements Runnable{
    private String name;
    ToiletBuilding toiletBuilding = new ToiletBuilding();

    public Person(String name){
        this.name=name;
    }
    @Override
    public void run() {
        try {
            toiletBuilding.stepIntoCabin();
            Thread.sleep(3000);
            System.out.println(name + " entered the cabin " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            toiletBuilding.leaveCabin();
            Thread.sleep(500);
            System.out.println(name + " has finnished shitting "+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
