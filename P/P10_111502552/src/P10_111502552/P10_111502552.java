// Practice 10
// Name: 蕭登鴻
// Student Number: 111502552
// Course 2023_CE1004_B


package P10_111502552;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class P10_111502552 extends Application {
	public Color genRandomColor() {
		return Color.color(Math.random(), Math.random(), Math.random());
	}

	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
		
		double len = 200;
		Rectangle rect = new Rectangle(200 - len / 2, 200 - len / 2, len, len);
		rect.setFill(genRandomColor());
		rect.setStroke(genRandomColor());
		rect.setStrokeWidth(2);
		
		pane.getChildren().add(rect);
		
		Scene scene = new Scene(pane, 400, 400);
		stage.setTitle("P10_111502552");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}