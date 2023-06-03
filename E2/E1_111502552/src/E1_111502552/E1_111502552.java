package E1_111502552;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class E1_111502552 extends Application {
	public static double w = 640;
	public static int cur_circle = 0;
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("E1_111502552");
		
		Group root = new Group();
		Scene scene = new Scene(root, 640, 640);
		
		Circle[] circs = {
			new Circle(w/2, w/4, w/10, Color.LIGHTBLUE),
			new Circle(w - w/4, w/2, w/10, Color.LIGHTGREEN),
			new Circle(w/2, w - w/4, w/10, Color.YELLOW),
			new Circle(w/4, w/2, w/10, Color.ORANGE)
		};
		
		root.getChildren().add(circs[cur_circle]);
		cur_circle++;
		
		Timeline anima = new Timeline(
			new KeyFrame(Duration.seconds(1), e -> {
				root.getChildren().clear();
				root.getChildren().add(circs[cur_circle]);
				cur_circle = (cur_circle + 1) % 4;
			})
		);
		anima.setCycleCount(Timeline.INDEFINITE);
		anima.play();
		
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
