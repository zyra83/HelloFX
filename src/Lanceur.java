import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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

		/*
		 * STATIQUE - charger le fichier XML qui contient la description de
		 * l'interface graphique.
		 */
		VBox layout = FXMLLoader.load(this.getClass().getResource("/view/Hellooo.fxml"));

		/*
		 * INSTANCIE - J'instancie le FXMLLoader dans le cas de figure ou j'ai
		 * besoin de spécifier une classe controleur associée à la vue.
		 */
		// FXMLLoader loader = new FXMLLoader();
		// loader.load(this.getClass().getResource("/view/Hellooo.fxml"));

		Scene scene = new Scene(layout, 250, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Premier FX en déclaratif");
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

}
