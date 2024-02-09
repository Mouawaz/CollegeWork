public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterIncrementer c1 = new CounterIncrementer(counter, 10);
        CounterIncrementer c2 = new CounterIncrementer(counter, 10);
        Thread t1 = new Thread(c1, "Thread 1");
        Thread t2 = new Thread(c2, "Thread 2");
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName() + ":" + counter.getValue());

    }
}