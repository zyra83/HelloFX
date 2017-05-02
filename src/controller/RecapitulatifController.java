package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class RecapitulatifController {
	// TODO ajouter un alvel et y afficher le resultat

	@FXML
	Label lblRecap;

	String texte;

	public RecapitulatifController(String ptexte) {
		log.info(String.format("instanciation avec %s", ptexte));
		this.texte = ptexte;
	}

	@FXML
	public void initialize() {
		lblRecap.setText(texte);
	}

}
