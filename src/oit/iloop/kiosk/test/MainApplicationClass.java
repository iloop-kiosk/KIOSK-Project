package oit.iloop.kiosk.test;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplicationClass extends Application{

    @Override
    public void start(Stage stage){
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("test.fxml"));
    	Parent root;
		try {
			root = (Parent)fxmlLoader.load();
	        
	        MainControl mc = (MainControl)fxmlLoader.getController();
	        mc.setStage(stage);

	        Scene scene = new Scene(root);

	        stage.setScene(scene);
	        
	        stage.setFullScreen(false); // フルスクーリーンを無効化
	        stage.setResizable(false);  // リサイズを無効化
	        stage.show();    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
    public static void main(String[] args) {
    	launch();
    }
}