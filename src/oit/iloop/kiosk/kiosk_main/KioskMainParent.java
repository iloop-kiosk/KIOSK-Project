package oit.iloop.kiosk.kiosk_main;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class KioskMainParent extends Parent {

	public KioskMainParent() {

		URL location = getClass().getClassLoader().getResource(
				"mainlayout/kiosk_main_layout.fxml");
		System.out.println("getClass");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		System.out.println("FXMLLoader fxmlLoader");

		try {
			getChildren().add((Parent) fxmlLoader.load());
			System.out.println("getChildern");
			KioskMainController kmController = (KioskMainController) fxmlLoader.getController();
			System.out.println("kmController");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
