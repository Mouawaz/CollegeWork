public class ConfessionChair {
    private String sin;

    public synchronized void EnterConfessionBooth(String sin) throws InterruptedException {
        Thread.sleep(1000);
        int a = leaveConfessionBooth();
        System.out.println("Say it " + a);
        Thread.sleep(a);
        notifyAll();
    }
    public int leaveConfessionBooth(){
        return (int) (Math.random()*100);
    }
}
