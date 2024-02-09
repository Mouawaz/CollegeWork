public class CounterIncrementer implements Runnable{

    private Counter counter;
    private int updates;

    public CounterIncrementer(Counter counter, int updates){
        this.counter = counter;
        this.updates=updates;
    }
    @Override
    public void run() {
        for (int i = 0; i < updates; i++) {
            System.out.println(counter.getValue() +" Written by "+ Thread.currentThread().getName());
            counter.increment();
        }
    }
}
