package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class App3 extends Application implements EventHandler<ActionEvent>{

	private static final String TITLE = "App-3";

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle(TITLE);
		
		StackPane pane = new StackPane();
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		
		Button button = new Button();
		button.setOnAction(this);
		button.setText("Click me");
		pane.getChildren().add(button);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		System.out.println("You clicked me.");
	}

}
