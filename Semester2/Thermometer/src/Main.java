public class Main {

    public static void main(String[] args) {
    Thread thread1 = new Thread(new Thermometer("thermo1",15, 1));
        Thread thread2 = new Thread(new Thermometer("thermo1",15, 7));
    thread1.start();
    thread2.start();
    }
}