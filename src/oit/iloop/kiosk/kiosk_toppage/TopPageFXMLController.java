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
	KioskMain kioskMain;
	
	public void setKioskMain(KioskMain main){
		kioskMain = main;
	}
	
	void setParent(Parent parent){
		this.parent = parent;
	}
	EventHandler<MouseEvent> zyugyouHandler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
			
				if(parent != null){
					kioskMain.setMode(dispMode.MODE_TIMETABLE);
					parent.getScene().setRoot(kioskMain);
				
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
					kioskMain.setMode(dispMode.MODE_STUDYROOM);
					parent.getScene().setRoot(kioskMain);
				
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
					kioskMain.setMode(dispMode.MODE_SCHOOLMAP);
					parent.getScene().setRoot(kioskMain);
				
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
					kioskMain.setMode(dispMode.MODE_EXAMINATION);
					parent.getScene().setRoot(kioskMain);
				
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
					kioskMain.setMode(dispMode.MODE_BUS);
					parent.getScene().setRoot(kioskMain);
				
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
