/**
 *バスページのメインクラス 
 */
package oit.iloop.kiosk.kiosk_bus;


import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class BusMain extends Parent {
	
	public BusMain() throws IOException{
		
		/*FXMLファイルの読み込み*/
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("businfo.fxml"));
		
		/**/
		Parent fxmlSchene = (Parent)fxmlLoader.load();
		
		/**/
		getChildren().add(fxmlSchene);
		
//		InfoController infoController = (InfoController)fxmlLoader.getController("");
		
	}
}
