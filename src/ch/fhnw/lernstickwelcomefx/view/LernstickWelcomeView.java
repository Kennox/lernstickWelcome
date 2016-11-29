package ch.fhnw.lernstickwelcomefx.view;

import ch.fhnw.lernstickwelcomefx.model.LernstickWelcome;
import javafx.scene.Parent;

public class LernstickWelcomeView extends Parent { // change Parent to GridPane etc.
  private final LernstickWelcome model;

  //declare all elements here

  /** Javadoc comment here. */
  public LernstickWelcomeView(LernstickWelcome model) {
    this.model = model;

    layoutForm();
    initFieldData();
    bindFieldsToModel();
  }

  private void layoutForm() {
    //setup layout (aka setup specific pane etc.)
  }

  private void initFieldData() {
    //populate fields wich require initial data
  }

  private void bindFieldsToModel() {
    //make the bindings to the model
  }


}