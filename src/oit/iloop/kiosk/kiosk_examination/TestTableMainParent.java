package oit.iloop.kiosk.kiosk_examination;

import java.io.IOException;
import java.net.URL;

import oit.iloop.kiosk.kiosk_timetable.TimeTableMainController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class TestTableMainParent extends Parent{
	final static String testTableFXMLsrc = "Examination.fxml";

	public TestTableMainParent() {
		// TODO Auto-generated constructor stub

		URL location = getClass().getClassLoader()
				.getResource(testTableFXMLsrc);
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
