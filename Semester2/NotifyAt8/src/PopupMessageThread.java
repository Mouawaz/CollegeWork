import java.time.LocalTime;

public class PopupMessageThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            LocalTime currentTime = LocalTime.now();
            LocalTime targetTime = LocalTime.of(11, 37);

            if (currentTime.isAfter(targetTime) || currentTime.equals(targetTime)) {
                System.out.println("Popup message: Today's tasks");
                break;
            }

            long sleepTime = targetTime.toSecondOfDay() - currentTime.toSecondOfDay();
            try {
                Thread.sleep(sleepTime * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread popupThread = new Thread(new PopupMessageThread());
        popupThread.start();
    }
}