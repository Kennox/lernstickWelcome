package ch.fhnw.lernstickwelcomefx;

import ch.fhnw.lernstickwelcomefx.model.LernstickWelcome;
import ch.fhnw.lernstickwelcomefx.view.LernstickWelcomePresenter;
import ch.fhnw.lernstickwelcomefx.view.LernstickWelcomeView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LernstickWelcomeApp extends Application {
  public static final String APP_NAME = "LernstickWelcome";

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage) {
    LernstickWelcome model = new LernstickWelcome();
    LernstickWelcomeView view = new LernstickWelcomeView(model);

    // Must set the scene before creating the presenter that uses
    // the scene to listen for the focus change
    Scene scene = new Scene(view);

    LernstickWelcomePresenter presenter = new LernstickWelcomePresenter(model, view);

    stage.setScene(scene);
    stage.setTitle(APP_NAME);
    stage.show();
  }
}

