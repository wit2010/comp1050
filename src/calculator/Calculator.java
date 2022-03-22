package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application  implements EventHandler<ActionEvent> {

	private TextField textFieldNumber1;
	private TextField textFieldNumber2;

	private Button buttonDivide;
	private Button buttonMultiply;
	private Button buttonAddition;
	private Button buttonSubtraction;
	
	private Label labelAnswer;

	private Button buttonClear;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		textFieldNumber1 = new TextField();
		textFieldNumber2 = new TextField();

		buttonDivide = new Button("/");
		buttonMultiply = new Button("*");
		buttonAddition = new Button("+");
		buttonSubtraction = new Button("-");
		
		labelAnswer = new Label("?");

		buttonClear = new Button("Clear");

		labelAnswer.setAlignment(Pos.CENTER);
		labelAnswer.setStyle("-fx-border-color: #000; -fx-padding: 5px;");

		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);

		root.setHgap(10);
		root.setVgap(10);

		root.add(buttonDivide, 0, 0);
		root.add(buttonMultiply, 1, 0);
		root.add(buttonAddition, 0, 1);
		root.add(buttonSubtraction, 1, 1);

		root.add(textFieldNumber1, 0, 2);
		root.add(textFieldNumber2, 1, 2);

		root.add(labelAnswer, 0, 3, 2, 1);

		root.add(buttonClear, 0, 4, 2, 1);

		textFieldNumber1.setPrefWidth(70);
		textFieldNumber2.setPrefWidth(70);
		buttonDivide.setPrefWidth(70);
		buttonMultiply.setPrefWidth(70);
		buttonAddition.setPrefWidth(70);
		buttonSubtraction.setPrefWidth(70);
		labelAnswer.setPrefWidth(150);
		buttonClear.setPrefWidth(150);

		buttonAddition.setOnAction(this);
		buttonSubtraction.setOnAction(this);
		buttonMultiply.setOnAction(this);
		buttonDivide.setOnAction(this);

		buttonClear.setOnAction(e -> {
			textFieldNumber1.setText("");
			textFieldNumber2.setText("");
			labelAnswer.setText("?");
			textFieldNumber1.requestFocus();
		});
		
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent e) {
		int num1 = Integer.parseInt(textFieldNumber1.getText());
		int num2 = Integer.parseInt(textFieldNumber2.getText());

		int answer;
		char symbol;

		if (e.getSource() == buttonAddition) {
			symbol = '+';
			answer = num1 + num2;
		} else if (e.getSource() == buttonSubtraction) {
			symbol = '-';
			answer = num1 - num2;
		} else if (e.getSource() == buttonMultiply) {
			symbol = '*';
			answer = num1 * num2;
		} else {
			symbol = '/';
			answer = num1 / num2;
		}

		labelAnswer.setText("" + num1 + symbol + num2 + "=" + answer);
	}
}