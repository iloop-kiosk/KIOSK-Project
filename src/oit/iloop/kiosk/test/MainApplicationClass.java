package oit.iloop.kiosk.test;

import java.io.IOException;
import oit.iloop.kiosk.kiosk_main.KioskMain;
import oit.iloop.kiosk.kiosk_main.KioskMain.dispMode;

import oit.iloop.kiosk.kiosk_toppage.TopPageParent;

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



		Scene scene = new Scene(new KioskMain());
		// Scene scene = new Scene(aP);
		primaryStage.setFullScreen(false);

		primaryStage.setScene(scene);
		primaryStage.show();
		

		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
