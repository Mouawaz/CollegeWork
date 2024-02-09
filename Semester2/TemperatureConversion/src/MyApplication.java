
import Clock.RunnableClock;
import javafx.application.Application;
import javafx.stage.Stage;
import model.TemperatureModel;
import model.TemperatureModelManager;
import view.ViewHandler;

import java.util.Timer;


public class MyApplication extends Application
{
  Clock.RunnableClock RunnableClock = new RunnableClock();
  public void start(Stage primaryStage)
  {
    // Model
    TemperatureModel model = new TemperatureModelManager();

    // View
    ViewHandler view = new ViewHandler(model);
    view.start(primaryStage);

    RunnableClock thread = new RunnableClock();
    Thread t = new Thread(thread);
    t.start();


  }
}
