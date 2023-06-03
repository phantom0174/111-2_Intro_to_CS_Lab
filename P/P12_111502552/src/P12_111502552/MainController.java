package P12_111502552;


import java.net.MalformedURLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;


public class MainController {
	@FXML
	public ImageView image;
	@FXML
	public Button button;
	
	public void btnPressed(ActionEvent e) throws MalformedURLException {
		showAlert(
			"Locked!",
			"請查看 A12 以解鎖更多功能！"
		);
	}
	
	public void showAlert(String title, String headerText) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.showAndWait();
	}
}
