public class Churchgoer implements Runnable{

    private ConfessionChair confessionChair;
public Churchgoer(ConfessionChair confessionChair){
    this.confessionChair=confessionChair;
}

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            confessionChair.EnterConfessionBooth();
        }
    }
}
