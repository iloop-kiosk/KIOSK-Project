package oit.iloop.kiosk.kiosk_main;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class KioskMainParent extends Parent{

	public KioskMainParent() {
		// TODO Auto-generated constructor stub
		
		final Button button = new Button("click to another page");
		final VBox root = new VBox();
		final MainClock clock = new MainClock();
		final Label label = new Label("ClickText");
		
		label.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				root.getChildren().clear();
				root.getChildren().add(clock);
				root.getChildren().add(button);
			}
		});
		
		button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
			getScene().setRoot(new TestParent());	
			}
		});
		root.getChildren().addAll(label,button);
		getChildren().add(root);
		
		
		
		
		
		
	}
	
	
	
	
}
