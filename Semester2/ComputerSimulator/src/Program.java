public class Program implements Runnable{
    private String program;
    private long maxFrequency;
    private String action;
    private int count;
    private long RUNTIME = 10000;

    public Program(String program,String action, int count){
        this.action=action;
        this.program=program;
        this.count=count;
    }
    private void normalOperation() throws InterruptedException {
        System.out.println(program +" "+ action);
        Thread.sleep(RUNTIME/count);
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            try {
                normalOperation();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
