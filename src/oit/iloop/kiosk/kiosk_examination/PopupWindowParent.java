package oit.iloop.kiosk.kiosk_examination;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Popup;

public class PopupWindowParent extends Parent{
final static String examination_FXML_src = "examination/PopupWindow.fxml";
	
	public PopupWindowParent() {
		
		URL location = getClass().getClassLoader().getResource(examination_FXML_src);
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		
		try {
			getChildren().add((Parent) fxmlLoader.load());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

       
	

	}
	



