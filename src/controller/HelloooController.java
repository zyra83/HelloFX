package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class HelloooController {
	// TODO ajouter un alvel et y afficher le resultat

	@FXML
	ComboBox<String> maCombo;

	@FXML
	private ToggleGroup tgGlacon;
	
	@FXML
	private RadioButton rbAvec, rbSans;
	
	
	public HelloooController() {

	}

	public void cliquer() {
		if (log.isInfoEnabled()) {
			log.info(String.format("Clique sur le bouton : %s", maCombo.getSelectionModel().getSelectedItem()));
			log.info(String.format("Selected toggle : %s", tgGlacon.getSelectedToggle().getUserData()));
		}

	}

	/**
	 * AAPELLE atutomatiquement à l'insctiaiton
	 */
	@FXML
	public void initialize() {
		maCombo.getItems().addAll("a", "b", "c");
		rbAvec.setUserData(true);
		rbSans.setUserData(false);
	}

}
