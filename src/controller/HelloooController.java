package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class HelloooController {

	@FXML
	ComboBox<String> maCombo;

	public HelloooController() {

	}

	public void cliquer() {
		if (log.isInfoEnabled()) {
			log.info(String.format("Clique sur le bouton : %s", maCombo.getValue()));
			log.info(String.format("Clique sur le bouton : %s", maCombo.getSelectionModel().getSelectedItem()));
		}

	}

	/**
	 * AAPELLE atutomatiquement à l'insctiaiton
	 */
	@FXML
	public void initialize() {
		maCombo.getItems().addAll("a", "b", "c");
	}

}
