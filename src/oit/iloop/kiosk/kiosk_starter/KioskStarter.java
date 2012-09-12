package oit.iloop.kiosk.kiosk_starter;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oit.iloop.kiosk.kiosk_main.KioskMainParent;
import oit.iloop.kiosk.kiosk_main.KioskMainParent.dispMode;

public class KioskStarter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = new KioskMainParent(dispMode.MODE_TIMETABLE);
		
		
		root.setScaleX(1);
		root.setScaleY(1);
		root.setTranslateX(0);
		root.setTranslateY(0);
		Scene scene = new Scene(root);
		
		primaryStage.setFullScreen(false);

		primaryStage.setResizable(false);
		
		primaryStage.setScene(scene);
		
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
