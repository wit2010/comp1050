package javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class App4 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Circle circle = new Circle();
		circle.setCenterX(0);
		circle.setCenterY(0);
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);

		Pane pane = new Pane();
		pane.getChildren().add(circle);

		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));

		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Circle!");
		primaryStage.setScene(scene);
		primaryStage.setResizable(true);
		primaryStage.show();
	}
	
}
