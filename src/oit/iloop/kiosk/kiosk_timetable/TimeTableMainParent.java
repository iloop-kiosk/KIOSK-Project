package oit.iloop.kiosk.kiosk_timetable;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class TimeTableMainParent extends Parent {

	final static String timeTableFXMLsrc = "timetablelayout/timetable_main_layout.fxml";

	public TimeTableMainParent() {
		// TODO Auto-generated constructor stub

		URL location = getClass().getClassLoader()
				.getResource(timeTableFXMLsrc);
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		try {
			getChildren().add((Parent) fxmlLoader.load());


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TimeTableMainController ttmController = (TimeTableMainController) fxmlLoader
				.getController();
	}

}
