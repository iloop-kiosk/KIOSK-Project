/**
 * 
 */
package oit.iloop.kiosk.kiosk_main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author katoumasanori
 * 
 */
public class KioskMain extends Application {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		final AnchorPane root = new AnchorPane();
		final MainClock clock = new MainClock();

		Label testLabel = new Label("Show Clock");
		testLabel.addEventFilter(MouseEvent.MOUSE_CLICKED,
				new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent event) {
						// TODO Auto-generated method stub
						root.getChildren().clear();
						root.getChildren().add(clock);

					}

				});
		

		root.getChildren().add(testLabel);
		Scene scene = new Scene(root, 500, 500);
		
		primaryStage.setScene(scene);
		primaryStage.setFullScreen(true);
		primaryStage.show();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
