package Clock;

import view.TemperatureViewController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RunnableClock implements Runnable {
    private DateTimeFormatter timeFormatter;
    private TemperatureViewController temperatureViewController;

    public RunnableClock(TemperatureViewController temperatureViewController){
        this.temperatureViewController = temperatureViewController;
    }
    String timeString;

    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            LocalTime time = LocalTime.now();
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            timeString = time.format(timeFormatter);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(timeFormatter);
            temperatureViewController.showTime(timeString);
        }
    }

    public String getTimeString() {
        return timeString;
    }
}
