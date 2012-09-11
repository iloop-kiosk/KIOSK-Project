package oit.iloop.kiosk.kiosk_examination;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class ExaminationMainParent extends Parent {
	
	final static String examination_FXML_src = "examination/Examination.fxml";
	
	public ExaminationMainParent() {
		
		URL location = getClass().getClassLoader().getResource(examination_FXML_src);
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		
		try {
			getChildren().add((Parent) fxmlLoader.load());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
