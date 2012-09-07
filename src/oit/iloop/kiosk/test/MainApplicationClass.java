package oit.iloop.kiosk.test;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplicationClass extends Application{

	@Override
	public void start(Stage primaryStage) throws IOException {
		// TODO Auto-generated method stub
		
		
		URL location = getClass().getClassLoader().getResource("mainlayout/kiosk_main_layout.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		
		
		
		
		Parent root = (Parent)fxmlLoader.load();

		MainApplicationController maController = fxmlLoader.getController();
		Scene scene = new Scene(root);
		
		primaryStage.setFullScreen(false);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	
	
	
	
}
