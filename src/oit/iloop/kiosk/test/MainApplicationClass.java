package oit.iloop.kiosk.test;

import java.io.IOException;
import java.net.URL;

import oit.iloop.kiosk.kiosk_toppage.TopPageParent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplicationClass extends Application{

	@Override
	public void start(Stage primaryStage) throws IOException {
		// TODO Auto-generated method stub
		
		

		
	
		Scene scene = new Scene(new TopPageParent());
		
		primaryStage.setFullScreen(true);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	
	
	
	
}
