package oit.iloop.kiosk.kiosk_timetable;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Region;

public class TimeTableMain extends Region {

	final static String timeTableFXMLsrc = "timetablelayout/timetable_main_layout.fxml";

	public TimeTableMain() throws IOException {
		// TODO Auto-generated constructor stub

		URL location = getClass().getClassLoader()
				.getResource(timeTableFXMLsrc);
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		
			getChildren().add((Parent) fxmlLoader.load());


		TimeTableMainController ttmController = (TimeTableMainController) fxmlLoader
				.getController();
	}

}
