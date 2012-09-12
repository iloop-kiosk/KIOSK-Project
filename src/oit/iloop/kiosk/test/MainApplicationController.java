package oit.iloop.kiosk.test;

import java.net.URL;
import java.util.ResourceBundle;

import oit.iloop.kiosk.kiosk_main.KioskMainParent;
import oit.iloop.kiosk.kiosk_main.MainClock;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class MainApplicationController implements Initializable {

	@FXML
	Button tab_01;//授業
	@FXML
	Button tab_02;//テスト
	@FXML
	Button tab_03;//バス
	@FXML
	Button tab_04;//学内地図
	@FXML
	Button tab_05;//自習室

	@FXML
	Pane main_pane;

	@FXML
	Pane main_clock;
	@FXML
	Pane main_logo;

	public void setMainPane(Pane pane){
		main_pane.getChildren().add(pane);
	}
	
	EventHandler<MouseEvent> tab01Handler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
			tab_01.setTextFill(Color.RED);
			tab_02.setTextFill(Color.BLACK);
			tab_03.setTextFill(Color.BLACK);
			tab_04.setTextFill(Color.BLACK);
			tab_05.setTextFill(Color.BLACK);
			
			
			}
		}
		
	};
	EventHandler<MouseEvent> tab02Handler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
				tab_01.setTextFill(Color.BLACK);
				tab_02.setTextFill(Color.RED);
				tab_03.setTextFill(Color.BLACK);
				tab_04.setTextFill(Color.BLACK);
				tab_05.setTextFill(Color.BLACK);
				
				
			}
		}
		
	};
	EventHandler<MouseEvent> tab03Handler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
				tab_01.setTextFill(Color.BLACK);
				tab_02.setTextFill(Color.BLACK);
				tab_03.setTextFill(Color.RED);
				tab_04.setTextFill(Color.BLACK);
				tab_05.setTextFill(Color.BLACK);
				
				
			}
		}
		
	};
	EventHandler<MouseEvent> tab04Handler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
			
				tab_01.setTextFill(Color.BLACK);
				tab_02.setTextFill(Color.BLACK);
				tab_03.setTextFill(Color.BLACK);
				tab_04.setTextFill(Color.RED);
				tab_05.setTextFill(Color.BLACK);
				
			}
		}
		
	};
	EventHandler<MouseEvent> tab05Handler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
				tab_01.setTextFill(Color.BLACK);
				tab_02.setTextFill(Color.BLACK);
				tab_03.setTextFill(Color.BLACK);
				tab_04.setTextFill(Color.BLACK);
				tab_05.setTextFill(Color.RED);
				
				
			}
		}
		
	};
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		tab_01.setText("授業");
		tab_01.addEventHandler(MouseEvent.ANY, tab01Handler);
		tab_02.setText("テスト");
		tab_02.addEventHandler(MouseEvent.ANY, tab02Handler);
		tab_03.setText("バス時刻表");
		tab_03.addEventHandler(MouseEvent.ANY, tab03Handler);
		tab_04.setText("学内地図");
		tab_04.addEventHandler(MouseEvent.ANY, tab04Handler);
		tab_05.setText("自習室");
		tab_05.addEventHandler(MouseEvent.ANY, tab05Handler);

		
		
		
		
		
		System.out.println("main_clock:height = " + main_clock.getHeight()
				+ ", width = " + main_clock.getWidth());
		main_clock.getChildren().add(
				new MainClock());
		main_logo.getChildren().add(
				new ImageView(new Image(getClass().getClassLoader()
						.getResourceAsStream("mainlayout/ohit101.gif"), main_logo
						.getHeight(), main_logo.getWidth(), true, true)));

	}

}
