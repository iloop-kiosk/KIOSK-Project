package oit.iloop.kiosk.kiosk_schoolmap;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Region;

public class CampusMapMain extends Region {
	public CampusMapMain() throws IOException {
		// TODO Auto-generated constructor stub

		URL location = getClass().getClassLoader().getResource(
				"campusmap/SchoolMap.fxml");
		FXMLLoader fxmlloader = new FXMLLoader(location);
		Parent root = (Parent) fxmlloader.load();
		getChildren().add(root);

	}

}
