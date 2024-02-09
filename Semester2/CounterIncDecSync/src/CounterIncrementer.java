public class CounterIncrementer implements Runnable{

    Counter counter;
    private int updates;

    public CounterIncrementer(Counter counter, int updates){
        this.updates = updates;
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < updates; i++) {


            counter.increment();
            System.out.println(counter.getValue() + " ***PRINTED BY*** " + Thread.currentThread().getName());
        }
    }
}
