package oit.iloop.kiosk.test;

import java.io.IOException;
import java.net.URL;

import oit.iloop.kiosk.kiosk_main.KioskMainParent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApplicationClass extends Application{

	@Override
	public void start(Stage primaryStage) throws IOException {
		// TODO Auto-generated method stub
		
		
		AnchorPane aP = new AnchorPane();
		aP.getChildren().add(new TextArea("aaaaaaaaaaaaaaaaaa"));
		aP.getChildren().add(new Button("yheaaaaaa"));
		
		
		
		Scene scene = new Scene(new KioskMainParent());
		//Scene scene = new Scene(aP);	
		primaryStage.setFullScreen(true);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	
	
	
	
}
