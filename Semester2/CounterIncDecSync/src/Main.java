public class Main {
    public static void main(String[] args) {

    Counter counter = new Counter(0,10 );

    CounterIncrementer C1 = new CounterIncrementer(counter,200);
    CounterIncrementer C2 = new CounterIncrementer(counter,200);

    CounterDecrementer D1 = new CounterDecrementer(counter,200);
    CounterDecrementer D2 = new CounterDecrementer(counter,200);

    Thread A = new Thread(C1);
    Thread B = new Thread(C2);
    Thread C = new Thread(D1);
    Thread D = new Thread(D2);

    A.start();
    B.start();
    C.start();
    D.start();
    }
}