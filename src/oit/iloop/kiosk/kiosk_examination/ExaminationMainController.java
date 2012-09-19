package oit.iloop.kiosk.kiosk_examination;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


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
	@FXML Button button02; 
	@FXML Button button03; 
	@FXML Button button04; 
	@FXML Button button05; 
	@FXML Button button06; 
	@FXML Button button07; 
	@FXML Button button08; 
	@FXML Button button09; 
	@FXML Button button10; 
	@FXML Button button11; 
	@FXML Button button12; 
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
	private EventHandler<MouseEvent> button02Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	
	private EventHandler<MouseEvent> button03Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	private EventHandler<MouseEvent> button04Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	private EventHandler<MouseEvent> button05Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	private EventHandler<MouseEvent> button06Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	private EventHandler<MouseEvent> button07Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	private EventHandler<MouseEvent> button08Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	private EventHandler<MouseEvent> button09Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	private EventHandler<MouseEvent> button10Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	private EventHandler<MouseEvent> button11Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	private EventHandler<MouseEvent> button12Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				
				popupPane();
			}
		}

	};
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

button01.addEventHandler(MouseEvent.ANY, button01Handler);
button02.addEventHandler(MouseEvent.ANY, button02Handler);
button03.addEventHandler(MouseEvent.ANY, button03Handler);
button04.addEventHandler(MouseEvent.ANY, button04Handler);
button05.addEventHandler(MouseEvent.ANY, button05Handler);
button06.addEventHandler(MouseEvent.ANY, button06Handler);
button07.addEventHandler(MouseEvent.ANY, button07Handler);
button08.addEventHandler(MouseEvent.ANY, button08Handler);
button09.addEventHandler(MouseEvent.ANY, button09Handler);
button10.addEventHandler(MouseEvent.ANY, button10Handler);
button11.addEventHandler(MouseEvent.ANY, button11Handler);
button12.addEventHandler(MouseEvent.ANY, button12Handler);
	}

}
