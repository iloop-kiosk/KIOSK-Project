package oit.iloop.kiosk.kiosk_schoolmap;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class CampusMapMainController implements Initializable {

	Image[] maps = new Image[6];
	String[] filenames = { "campusmap/f1.png", "campusmap/f2.png",
			"campusmap/f3.png", "campusmap/f4.png", "campusmap/f5.png",
			"campusmap/f6.png", };

	@FXML
	ImageView MAP_image;

	@FXML
	Button btn01;

	@FXML
	Button btn02;
	@FXML
	Button btn03;

	@FXML
	Button btn04;
	@FXML
	Button btn05;
	@FXML
	Button btn06;
	
	
	

	EventHandler<MouseEvent> eHandler01 = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			MAP_image.setImage(maps[0]);
		}
		
	};
	

	EventHandler<MouseEvent> eHandler02 = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			MAP_image.setImage(maps[1]);
		}
		
	};
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < maps.length;i++){
			maps[i] = new Image(getClass().getClassLoader().getResourceAsStream(filenames[i]));
		}
		btn01.addEventHandler(MouseEvent.MOUSE_CLICKED, eHandler01);
		
		btn02.addEventHandler(MouseEvent.MOUSE_CLICKED, eHandler02);
		
		
		
		
	}

	public void setMapImage(){
		
	}
	
}
