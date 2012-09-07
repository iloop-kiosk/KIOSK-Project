package oit.iloop.kiosk.test;

import oit.iloop.kiosk.kiosk_main.KioskMainParent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApplicationClass extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene = new Scene(new KioskMainParent());
		
		
		primaryStage.setFullScreen(true);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	
	
	
	
}
