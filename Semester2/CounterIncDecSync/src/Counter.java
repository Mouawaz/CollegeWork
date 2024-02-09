public class Counter {
    private long value;
    private long max;
    private long min;



    public Counter(long min, long max){
        this.max=max;
        this.min=min;
        this.value = 0;

    }

    public long getValue() {
        return value;
    }

    public synchronized void increment() {

        while(value>=max){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        value++;
        notifyAll();
    }

    public synchronized  void decrement() {
        while(value<=min){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        value++;
        notifyAll();
    }

}
