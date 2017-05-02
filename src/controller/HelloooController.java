package controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
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


		/*
		 * STATIQUE - charger le fichier XML qui contient la description de
		 * l'interface graphique.
		 */
		try {
			FXMLLoader loader = new FXMLLoader();
			VBox vbx = (VBox) loader.load(this.getClass().getResource("/view/Recapitulatif.fxml"));
			loader.setController(new RecapitulatifController("TEST"));
			
			// je récpere une référence de la scene
			Scene scene = maCombo.getScene();
			scene.setRoot(vbx);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
