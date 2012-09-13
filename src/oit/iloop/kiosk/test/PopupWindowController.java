
package oit.iloop.kiosk.test;

import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JFrame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Popup;
import javafx.stage.Stage;

/**
 *
 * @author Namiroo
 */
public class PopupWindowController implements Initializable {
	String[] resPaths = {"8月24日","8月25日","8月26日","8月27日","8月28日"};
	PictClass1[] pict = new PictClass1[resPaths.length];
	private int i=0;
    @FXML private Label label;
    @FXML private Label day_label;
    @FXML private AnchorPane main_pane;
    @FXML private AnchorPane top_pane;
    @FXML private Pane right_pane;
    @FXML private Pane left_pane;
    @FXML private GridPane gridpane2;
    @FXML private ImageView left_arrow;
    @FXML private ImageView right_arrow;
  
    Popup popup = new Popup();
    
	@FXML
    private void handle1ButtonAction(ActionEvent event) {
		 JFrame aFrame = new JFrame("Cool Running");

        System.out.println("閉じる");
      
        

       
    }
    
   



	@FXML
    private void clickLeftArrowButton(MouseEvent event) {
		for(int i = 0 ;i < resPaths.length;i++){
			pict[i] = new PictClass1(resPaths[i]);
		}
		
        System.out.println("左矢印ボタンクリック");
        
        day_label.setText("8月24日");
    }
	
	@FXML
    private void clickRightArrowButton(MouseEvent event) {
		
    	System.out.println("右矢印ボタンクリック");
    	
    	day_label.setText("8月25日");
    	i++;
    }
    
    // ����l�ݒ�
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	Button button = new Button("Add");
    	//double x = right_pane.getWidth();
        /*
        for(int i = 0; i < 15; i++) {
        	right_pane.getChildren().addAll(button);
        }
        */
        left_pane.getChildren().addAll(button);
        //day_label.setStyle("-fx-background-color: mistyrose");
        //gridpane2.setGridLinesVisible(true); //GridPane�ɘg��\��
        
    }

	public ImageView getRight_arrow() {
		return right_arrow;
	}

	public void setRight_arrow(ImageView right_arrow) {
		this.right_arrow = right_arrow;
	}

	public ImageView getLeft_arrow() {
		return left_arrow;
	}

	public void setLeft_arrow(ImageView left_arrow) {
		this.left_arrow = left_arrow;
	}

	public GridPane getGridpane2() {
		return gridpane2;
	}

	public void setGridpane2(GridPane gridpane2) {
		this.gridpane2 = gridpane2;
	}

	public Pane getRight_pane() {
		return right_pane;
	}

	public void setRight_pane(Pane right_pane) {
		this.right_pane = right_pane;
	}

	public AnchorPane getTop_pane() {
		return top_pane;
	}

	public void setTop_pane(AnchorPane top_pane) {
		this.top_pane = top_pane;
	}

	public AnchorPane getMain_pane() {
		return main_pane;
	}

	public void setMain_pane(AnchorPane main_pane) {
		this.main_pane = main_pane;
	}
}
