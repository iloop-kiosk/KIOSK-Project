package oit.iloop.kiosk.test;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class MainControl implements Initializable {
		
	private Parent root;
	private Scene popupScene;
	private Stage popupStage = new Stage();
	Stage primaryStage;
	Popup popup = new Popup();
	
	public void setStage(Stage stage){
		primaryStage = stage;
	}
	@FXML
	private void bottun01(MouseEvent event) {
		try {
			root = FXMLLoader.load(getClass().getClassLoader().getResource("PopupWindow.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        popupScene = new Scene(root);
        popupStage.setScene(popupScene);
        popupStage.setResizable(false);
        popupStage.show();    
		//popup.show(primaryStage);
	}
	@FXML
	private void bottun02(MouseEvent event) {
		
		popup.show(primaryStage);
	}
	@FXML
	private void bottun03(MouseEvent event) {
		
		popup.show(primaryStage);
	}
	@FXML
	private void bottun04(MouseEvent event) {
	
		popup.show(primaryStage);
	}
	@FXML
	private void bottun05(MouseEvent event) {
	
		popup.show(primaryStage);
	}
	@FXML
	private void bottun06(MouseEvent event) {
		
		popup.show(primaryStage);
	}
	@FXML
	private void bottun07(MouseEvent event) {
	
		popup.show(primaryStage);
	}
	@FXML
	private void bottun08(MouseEvent event) {
	
		popup.show(primaryStage);
	}
	@FXML
	private void bottun09(MouseEvent event) {
		
		popup.show(primaryStage);
	}
	@FXML
	private void bottun10(MouseEvent event) {
		
		popup.show(primaryStage);
	}
	@FXML
	private void bottun11(MouseEvent event) {
		
		popup.show(primaryStage);
	}
	@FXML
	private void bottun12(MouseEvent event) {
		
		popup.show(primaryStage);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		try {
	    	root = FXMLLoader.load(getClass().getClassLoader().getResource("PopupWindow.fxml"));
	        popupScene = new Scene(root);
	        popupStage.setScene(popupScene);
	        popupStage.setResizable(false);
	        popup.getContent().add(root);
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
}