package oit.iloop.kiosk.kiosk_toppage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class TopPageFXMLController implements Initializable {

	@FXML
	ImageView sab ;
	
	
	EventHandler<MouseEvent> sabHandler = new EventHandler<MouseEvent>(){

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
				System.out.println("クリック");
				
			}
			
		}
		
		
		
		
	};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		sab.addEventHandler(MouseEvent.ANY, sabHandler);
		
		
		
	}

}
