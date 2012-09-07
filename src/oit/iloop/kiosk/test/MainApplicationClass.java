package oit.iloop.kiosk.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplicationClass extends Application{
    @Override
    public void start(Stage stage) throws Exception {
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("test.fxml"));
    	Parent root = (Parent)fxmlLoader.load();
        Scene scene = new Scene(root);
        
        MainControl mc = (MainControl)fxmlLoader.getController();
        mc.setStage(stage);
        
        
        stage.setScene(scene);
        stage.setFullScreen(false); // フルスクーリーンを無効化
        stage.setResizable(false);  // リサイズを無効化
        stage.show();    
    }
    
    public static void main(String[] args) {
    	launch();
    }
	/*
	String[] resPaths = {"./path3123.png","./path3125.png","./path3127.png","./path3129.png","./rect2972.png"};
	PictClass1[] pict = new PictClass1[resPaths.length];
	ShowImageIndicator siIndicator = new ShowImageIndicator(resPaths.length);
	
	
	@Override
	public void start(Stage stage) throws Exception {
		/*
		// TODO Auto-generated method stub
		for(int i = 0 ;i < resPaths.length;i++){
			pict[i] = new PictClass1(resPaths[i]);
		}
		
		
		final AnchorPane root = new AnchorPane();
		root.getChildren().add(pict[siIndicator.getIndicator()]);
		
		Scene scene = new Scene(root);
		scene.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				if(event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
					siIndicator.increment();
					root.getChildren().clear();
					root.getChildren().add(pict[siIndicator.getIndicator()]);
					primaryStage.setWidth(pict[siIndicator.getIndicator()].getImageWidth());
					primaryStage.setHeight(pict[siIndicator.getIndicator()].getImageHeight());
					
				
					
					
					
				}
			}
			
			
		});
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("test.fxml"));
    	Parent root = (Parent)fxmlLoader.load();
        Scene scene = new Scene(root);
        MainControl mc = (MainControl)fxmlLoader.getController();
        mc.setStage(stage);
        stage.setScene(scene);
        stage.setFullScreen(false); // フルスクーリーンを無効化
        stage.setResizable(false);  // リサイズを無効化
        stage.show();    
		
	
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	
	
	
	
	
	class ShowImageIndicator{
		int indicator = 0;
		int max=1;
		
		
		public ShowImageIndicator(int max) {
			// TODO Auto-generated constructor stub
			this.max = max;
		}
		
		public void increment(){
			indicator = (indicator+1)%max;
			
			
		}
		public void decremrnt(){
			indicator = indicator-1;
			if(indicator < 0){
				indicator = max-1;
			}
		}
		public int getIndicator() {
			return indicator;
		}
		
		
	}
	
	*/
	

}
