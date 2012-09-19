package oit.iloop.kiosk.test;

import java.io.IOException;
import oit.iloop.kiosk.kiosk_main.KioskMain;
import oit.iloop.kiosk.kiosk_main.KioskMain.dispMode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApplicationClass extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		// TODO Auto-generated method stub

		AnchorPane aP = new AnchorPane();
		aP.getChildren().add(new TextArea("aaaaaaaaaaaaaaaaaa"));
		aP.getChildren().add(new Button("yheaaaaaa"));

		Scene scene = new Scene(new KioskMain(dispMode.MODE_TIMETABLE));
		// Scene scene = new Scene(aP);
		primaryStage.setFullScreen(false);

		primaryStage.setScene(scene);
		primaryStage.show();

		
		System.out.println("hage");
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
