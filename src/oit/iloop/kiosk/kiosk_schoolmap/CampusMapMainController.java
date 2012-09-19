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
	
	
	
	public void setActiveButton(Button selectedButton){
		resetButtonStyle();
		selectedButton
				.setStyle("-fx-background-color: linear-gradient(to bottom, #b7deed 0%,#71ceef 50%,#21b4e2 51%,#b7deed 100%);"
						+ "	-fx-background-radius: 8 8 0 0;"
						+ "-fx-text-fill: orange;");
	}
	public void resetButtonStyle(){
		btn01.setStyle("");
		btn02.setStyle("");
		btn03.setStyle("");
		btn04.setStyle("");
		btn05.setStyle("");
		btn06.setStyle("");
		btn01.getStyleClass().add("button");
		btn02.getStyleClass().add("button");
		btn03.getStyleClass().add("button");
		btn04.getStyleClass().add("button");
		btn05.getStyleClass().add("button");
		btn06.getStyleClass().add("button");
		
	}
	

	EventHandler<MouseEvent> eHandler01 = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			MAP_image.setImage(maps[0]);
			setActiveButton(btn01);
		}
		
	};
	

	EventHandler<MouseEvent> eHandler02 = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			MAP_image.setImage(maps[1]);
			setActiveButton(btn02);
		}
		
	};
	
	EventHandler<MouseEvent> eHandler03 = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			MAP_image.setImage(maps[2]);
			setActiveButton(btn03);
		}
		
	};
	EventHandler<MouseEvent> eHandler04 = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			MAP_image.setImage(maps[3]);
			setActiveButton(btn04);
		}
		
	};
	EventHandler<MouseEvent> eHandler05 = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			MAP_image.setImage(maps[4]);
			setActiveButton(btn05);
		}
		
	};
	
	EventHandler<MouseEvent> eHandler06 = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			MAP_image.setImage(maps[5]);
			setActiveButton(btn06);
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
		
		btn03.addEventHandler(MouseEvent.MOUSE_CLICKED, eHandler03);
		btn04.addEventHandler(MouseEvent.MOUSE_CLICKED, eHandler04);
		btn05.addEventHandler(MouseEvent.MOUSE_CLICKED, eHandler05);
		btn06.addEventHandler(MouseEvent.MOUSE_CLICKED, eHandler06);
		setActiveButton(btn01);
		
	}

	public void setMapImage(){
		
	}
	
}
