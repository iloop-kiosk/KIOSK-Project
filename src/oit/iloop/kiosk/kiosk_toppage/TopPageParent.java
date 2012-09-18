package oit.iloop.kiosk.kiosk_toppage;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class TopPageParent extends Parent {

	public TopPageParent() throws IOException {
		// TODO Auto-generated constructor stub
		
		
		

		URL location = getClass().getClassLoader().getResource("toppagelayout/toppage.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		Parent root = (Parent)fxmlLoader.load();
		
		
		TopPageFXMLController maController = fxmlLoader.getController();
		maController.setParent(this);
		getChildren().add(root);
		
		
		
	}
	
	
	
	
	
	
}
