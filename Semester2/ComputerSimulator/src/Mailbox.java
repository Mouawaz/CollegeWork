public class Mailbox implements Runnable{
    private long maxFrequency;
    private int count;
    private long RUNTIME= 10000;

    public Mailbox(int count){
        this.count=count;
    }
    private void waitingForMails() throws InterruptedException {
        System.out.println("New mail in your mailbox...");
        Thread.sleep(RUNTIME/count);
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            try {
                waitingForMails();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
