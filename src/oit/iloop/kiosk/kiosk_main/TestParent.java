package oit.iloop.kiosk.kiosk_main;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class TestParent extends Parent {

	public TestParent() {
		// TODO Auto-generated constructor stub
		final VBox ap = new VBox();
		ap.getChildren().add(new Label("2nd page"));
		Label label = new Label("click to 1st Page");
		ap.getChildren().add(label);
		
		
		
		
		label.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				ap.getScene().setRoot(new KioskMainParent());
				
			}
		});
		getChildren().add(ap);
	}
}
