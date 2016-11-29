package ch.fhnw.lernstickwelcomefx.view;

import ch.fhnw.lernstickwelcomefx.model.LernstickWelcome;

public class LernstickWelcomePresenter {
  private final LernstickWelcome model;
  private final LernstickWelcomeView view;

  /** Javadoc comment here. */
  public LernstickWelcomePresenter(LernstickWelcome model, LernstickWelcomeView view) {
    this.model = model;
    this.view = view;
    attachEvents();
  }

  private void attachEvents() {
    //TODO put all setOnAction/addListeners in here
  }
}