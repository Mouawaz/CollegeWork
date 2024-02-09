public class CounterDecrementer implements Runnable{


    Counter counter;
    private int updates;

    public CounterDecrementer(Counter counter, int updates){
        this.updates = updates;
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < updates; i++) {
            counter.decrement();
        System.out.println(counter.getValue() + " ***PRINTED BY THREAD*** "+ Thread.currentThread().getName());
    }
        }
}
