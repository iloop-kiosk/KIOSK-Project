package oit.iloop.kiosk.kiosk_main;

import java.io.IOException;
import java.net.URL;

import oit.iloop.kiosk.kiosk_toppage.TopPageParent;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;

public class KioskMain extends Region {
	public enum dispMode {
		MODE_TIMETABLE, MODE_SCHOOLMAP, MODE_BUS, MODE_STUDYROOM, MODE_EXAMINATION, MODE_NON,

	};

	KioskMainController kmController;
	

	public void setMode(dispMode mode){
		kmController.setMainPane(mode);
			
	}
	public void setTopPage(TopPageParent topPage){
		try {
			if(topPage  == null){
				topPage = new TopPageParent(this);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(kmController != null){
			kmController.setTopPageParent(topPage);
		}
	}
	
	public KioskMain() {

		URL location = getClass().getClassLoader().getResource(
				"mainlayout/kiosk_main_layout.fxml");
		System.out.println("getClass");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		System.out.println("FXMLLoader fxmlLoader");
		

		getStylesheets().add("mainlayout/mainlayout_style.css");
		try {
			Parent root = (Parent) fxmlLoader.load();
			getChildren().add(root);
			System.out.println("getChildern");
			kmController = (KioskMainController) fxmlLoader
					.getController();

			System.out.println("kmController");
			kmController.setParent(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
