package oit.iloop.kiosk.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Namiroo
 */
public class PopupWindow extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
    	//Popup popup = new Popup();
    	
    	Parent root = FXMLLoader.load(getClass().getResource("../../PopupWindow.fxml"));
        Scene scene = new Scene(root);
                
        stage.setScene(scene);
        stage.setFullScreen(false); // フルスクーリーンを無効化
        stage.setResizable(false);  // リサイズを無効化
        stage.setIconified(false);
        stage.show();
        
        //popup.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}