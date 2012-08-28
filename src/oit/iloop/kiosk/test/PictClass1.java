package oit.iloop.kiosk.test;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PictClass1 extends Parent{

	Image image;
	ImageView iView ;
	
	public PictClass1(String resAddress) {
		// TODO Auto-generated constructor stub
		
		image = new Image(getClass().getClassLoader().getResourceAsStream(resAddress));
		iView = new ImageView(image);
		iView.autosize();
	
		
		
		
		getChildren().add(iView);
		
	}
	
	public double getImageWidth(){
		return image.getWidth();
	}
	
	public double getImageHeight(){
		return image.getHeight();
	}
	
	
	
}
