package oit.iloop.kiosk.kiosk_toppage;

import java.io.IOException;
import java.net.URL;

import oit.iloop.kiosk.kiosk_main.KioskMain;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class TopPageParent extends Parent {

	public TopPageParent(KioskMain main) throws IOException {
		// TODO Auto-generated constructor stub
		main.setTopPage(this);	
		
		

		URL location = getClass().getClassLoader().getResource("toppagelayout/toppage.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		Parent root = (Parent)fxmlLoader.load();
		
		
		TopPageFXMLController maController = (TopPageFXMLController) fxmlLoader.getController();
		maController.setKioskMain(main);
		maController.setParent(this);
		getChildren().add(root);
	
		
		
		
	}
	
	
	
	
	
	
}
