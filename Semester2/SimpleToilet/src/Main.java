public class Main {
    public static void main(String[] args) {

        ToiletBuilding toiletBuilding1 = new ToiletBuilding();
        Person user = new Person("Daniel");
        for (int i = 0; i < 5; i++) {

            Thread pt = new Thread(user);
            pt.start();
        }
    }
}