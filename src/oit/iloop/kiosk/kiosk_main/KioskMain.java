package oit.iloop.kiosk.kiosk_main;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Region;

public class KioskMain extends Region {
	public enum dispMode{
		MODE_TIMETABLE,
		MODE_SCHOOLMAP,
		MODE_BUS,
		MODE_STUDYROOM,
		MODE_EXAMINATION,
		MODE_NON,
		
	};
	public KioskMain(){
		this(dispMode.MODE_NON);
	}
	public KioskMain(dispMode mode) {

		URL location = getClass().getClassLoader().getResource(
				"mainlayout/kiosk_main_layout.fxml");
		System.out.println("getClass");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		System.out.println("FXMLLoader fxmlLoader");
		
		
		try {
			Parent root = (Parent)fxmlLoader.load();
			root.getStylesheets().add("mainlayout/mainlayout_style.css");
			getChildren().add(root);
			System.out.println("getChildern");
			KioskMainController kmController = fxmlLoader.getController();
			System.out.println("kmController");
			kmController.setMainPane(mode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
