import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Lanceur extends Application {

	/**
	 * Override obligatoire
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(primaryStage.getUserData());
		primaryStage.setTitle("Titre");
		BorderPane layout = new BorderPane();
		Button btn = new Button("Click me !");
		layout.setCenter(btn);
		Scene scene = new Scene(layout, 250, 100);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * Obligatoire pour lanceer l'appli
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("[%s] Je suis dans le main.%n", Thread.currentThread().getName());
		launch(args);
	}

	/**
	 * Initialiser des trucs, optionnel
	 */
	@Override
	public void init() throws Exception {
		System.out.printf("[%s] Je suis dans le init.%n", Thread.currentThread().getName());
		System.out.println("passage par init, pour fermer ne pas utiliser System.exit, utiliser Platform.exit().");
		super.init();
	}

	/**
	 * Optionnel, fermer les connexions proprement
	 */
	@Override
	public void stop() throws Exception {
		System.out.println("passage par stop");
		super.stop();
	}

}
