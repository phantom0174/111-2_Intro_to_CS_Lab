// Practice 11
// Name: 蕭登鴻
// Student Number: 111502552
// Course 2023_CE1004_B


package P11_111502552;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class P11_111502552 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
		
		Arc arc = new Arc(200, 200, 80, 80, 0, 60);
		arc.setFill(Color.TRANSPARENT);
		arc.setType(ArcType.OPEN);
		arc.setStrokeWidth(20);
		arc.setStroke(Color.GRAY);
		arc.setStrokeLineCap(StrokeLineCap.SQUARE);
		
		pane.getChildren().add(arc);
		pane.setRotate(30);
		
		RotateTransition ani_1 = new RotateTransition(Duration.seconds(2), pane);
		ani_1.setDuration(Duration.seconds(2));
		ani_1.setCycleCount(Timeline.INDEFINITE);
		ani_1.setByAngle(720);
		ani_1.play();
		
		Timeline timeline = new Timeline(
			new KeyFrame(Duration.ZERO, new KeyValue(arc.opacityProperty(), 0.1)),
			new KeyFrame(Duration.seconds(2), new KeyValue(arc.opacityProperty(), 1)),
			new KeyFrame(Duration.seconds(4), new KeyValue(arc.opacityProperty(), 0.1))
		);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		
		Scene scene = new Scene(pane, 400, 400);
		stage.setTitle("P11_111502552");
		stage.setScene(scene);
		stage.show();
	}
}
