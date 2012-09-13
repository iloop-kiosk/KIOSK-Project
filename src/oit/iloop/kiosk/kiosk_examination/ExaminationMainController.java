package oit.iloop.kiosk.kiosk_examination;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import oit.iloop.kiosk.kiosk_timetable.TimeTableMainParent;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class ExaminationMainController implements Initializable {
	final static String examination_FXML_src = "examination/PopupWindow.fxml";

	@FXML private Pane main_pane;

	@FXML Button button01; 
	private void popupPane() {


		Popup popup = new Popup();
		URL location = getClass().getClassLoader().getResource(examination_FXML_src);
		FXMLLoader fxmlLoader = new FXMLLoader(location);

		try {
			popup.getContent().add((Parent)fxmlLoader.load());
			PopupWindowController pwC = (PopupWindowController)fxmlLoader.getController();
			pwC.setPopup(popup);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		popup.show(main_pane.getScene().getWindow());
	}
		


	private EventHandler<MouseEvent> button01Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	
	@FXML private void button02(MouseEvent Event) {
		
	}
	
	@FXML private void button03(MouseEvent Event) {
		
	}
	
	@FXML private void button04(MouseEvent Event) {
		
	}
	
	@FXML private void button05(MouseEvent Event) {
		
	}
	
	@FXML private void button06(MouseEvent Event) {
		
	}
	
	@FXML private void button07(MouseEvent Event) {
		
	}
	
	@FXML private void button08(MouseEvent Event) {
		
	}
	
	@FXML private void button09(MouseEvent Event) {
		
	}
	
	@FXML private void button10(MouseEvent Event) {
		
	}
	
	@FXML private void button11(MouseEvent Event) {
		
	}
	
	@FXML private void button12(MouseEvent Event) {
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
button01.setText("test");
button01.addEventHandler(MouseEvent.ANY, button01Handler);
	}

}
