package javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class App2 extends Application {

	private static final String TITLE = "App-2";

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle(TITLE);
		
		StackPane pane = new StackPane();
		Scene scene = new Scene(pane, 600, 400);
		primaryStage.setScene(scene);
		
		Button button1 = new Button();
		button1.setText("Click me");
		pane.getChildren().add(button1);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
