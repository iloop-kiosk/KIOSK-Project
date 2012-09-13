package oit.iloop.kiosk.kiosk_toppage;

import java.net.URL;
import java.util.ResourceBundle;

import oit.iloop.kiosk.kiosk_main.KioskMain;
import oit.iloop.kiosk.kiosk_main.KioskMain.dispMode;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;



public class TopPageFXMLController implements Initializable {

	@FXML
	ImageView zyugyou ;
	@FXML
	ImageView lecture;
	@FXML
	ImageView map;
	@FXML
	ImageView test;
	@FXML
	ImageView bus;

	Parent parent;
	
	
	void setParent(Parent parent){
		this.parent = parent;
	}
	EventHandler<MouseEvent> zyugyouHandler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
			
				if(parent != null){
					parent.getScene().setRoot(new KioskMain(dispMode.MODE_TIMETABLE));
				
				}
			}
			
		}
	};
	
	
	EventHandler<MouseEvent> lectureHandler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
				if(parent != null){
					parent.getScene().setRoot(new KioskMain(dispMode.MODE_STUDYROOM));
				}
			}
		}
	};
	EventHandler<MouseEvent> mapHandler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
				if(parent != null){
					parent.getScene().setRoot(new KioskMain(dispMode.MODE_SCHOOLMAP));
				}
			}
			
		}
};

	EventHandler<MouseEvent> testHandler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
				if(parent != null){
					parent.getScene().setRoot(new KioskMain(dispMode.MODE_EXAMINATION));
					}
				}
		}
	
};

	EventHandler<MouseEvent> busHandler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
				if(parent != null){
					parent.getScene().setRoot(new KioskMain(dispMode.MODE_BUS));
				}
			}
				
		}
		
		
	};



	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		zyugyou.addEventHandler(MouseEvent.ANY, zyugyouHandler);
		lecture.addEventHandler(MouseEvent.ANY, lectureHandler);
		map.addEventHandler(MouseEvent.ANY, mapHandler);
		test.addEventHandler(MouseEvent.ANY, testHandler);
		bus.addEventHandler(MouseEvent.ANY, busHandler);
		
	}

}
