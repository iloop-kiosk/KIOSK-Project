package oit.iloop.kiosk.kiosk_examination;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Region;

public class ExaminationMain extends Region {
	
	final static String examination_FXML_src = "examination/Examination.fxml";
	
	public ExaminationMain(){
		
		URL location = getClass().getClassLoader().getResource(examination_FXML_src);
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		
		try {
			getChildren().add((Parent) fxmlLoader.load());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
