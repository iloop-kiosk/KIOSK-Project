package oit.iloop.kiosk.kiosk_examination;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Popup;

public class PopupWindowParent extends Parent{
	
	public PopupWindowParent(){
		
		Popup popup = new Popup();
		
		URL location = getClass().getClassLoader()
					   .getResource("examination/PopupWindow.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		
		try {
			Parent root = (Parent)fxmlLoader.load();
	        popup.getContent().add(root);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		// PopupWindowController popupController = 
		// (PopupWindowController)fxmlLoader.getController();
		

	}
	
	/*
	public void openPopup(Popup popup, Stage stage) {
		popup.show(stage);
	}
	
	public void closePopup(Popup popup) {
		popup.hide();
	}
	*/

}
