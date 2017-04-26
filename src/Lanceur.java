import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class Lanceur extends Application {

	/**
	 * C'est cette méthode que lance FX pour démarrer le thread d'affichage. Par
	 * contre, depuis le main, c'est la méthode launch qu'il faut appeller.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {

		VBox layout = new VBox();
		Label lbl = new Label("Choisir");
		ComboBox<String> cbo = new ComboBox<>();
		cbo.getItems().addAll("Pico-bière", "Sky coc", "Perroquet");

		layout.getChildren().addAll(lbl, cbo);

		Scene scene = new Scene(layout, 250, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Premier FX en programmatique");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	/**
	 * En Java SE, le main est le point d'entrée dans l'application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		if (log.isInfoEnabled())
			log.info(String.format("[Thread:%s] Je suis dans le main.%n", Thread.currentThread().getName()));
		launch(args);
	}

	/**
	 * Initialiser des trucs, optionnel
	 */
	@Override
	public void init() throws Exception {
		if (log.isInfoEnabled()) {
			log.info(String.format("[Thread:%s] Je suis dans le init.", Thread.currentThread().getName()));
			log.info(String
					.format("passage par init, pour fermer ne pas utiliser System.exit, utiliser Platform.exit()."));
		}
		super.init();
	}

	/**
	 * Optionnel, fermer les connexions proprement
	 */
	@Override
	public void stop() throws Exception {
		if (log.isInfoEnabled())
			log.info(String.format("passage par stop"));
		super.stop();
	}

}
