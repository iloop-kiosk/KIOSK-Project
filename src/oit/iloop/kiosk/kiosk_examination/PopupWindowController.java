/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oit.iloop.kiosk.kiosk_examination;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Popup;

/**
 *
 * @author Namiroo
 */
public class PopupWindowController implements Initializable {
	int i = 0;
	String day[] = {"8月24日","8月25日", "8月26日"};
	
    @FXML private Label label;
    @FXML private Label day_label;
    @FXML private AnchorPane main_pane;
    @FXML private AnchorPane top_pane;
    @FXML private Pane right_pane;
    //@FXML private VBox left_vbox;
    @FXML private GridPane gridpane2;
    @FXML private ImageView left_arrow;
    @FXML private ImageView right_arrow;
    Popup popup;

    public void setPopup(Popup popup){
    	this.popup = popup;
    }
    
    
    
    
    @FXML
    public void handle1ButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        popup.hide();
        
    }
    
    @FXML
    private void clickLeftArrowButton(MouseEvent event) {
        if(i > 0) i--;
      
        day_label.setText(day[i]);

    }
    
    @FXML
    private void clickRightArrowButton(MouseEvent event) {
    	if(i < day.length-1) i++;
    
    	day_label.setText(day[i]);
    }
        
    @FXML
    private void clickCloseButton(MouseEvent event) {
    	//popupStage.close();
    }
    
    // ����l�ݒ�
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//    	Button button1 = new Button("BURRON 1");
//    	Button button2 = new Button("BUTTON 2");
//    	Button button3 = new Button("BUTTON 3");
    	//double x = right_pane.getWidth();
        
    	/*
        for(int i = 0; i < 15; i++) {
        	left_vbox.getChildren().addAll(button);
        }
    	*/
    	
 //       left_vbox.getChildren().addAll(button1, button2, button3);
        //day_label.setStyle("-fx-background-color: mistyrose");
        //gridpane2.setGridLinesVisible(true); //GridPane�ɘg��\��
    }
}
