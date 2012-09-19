package oit.iloop.kiosk.kiosk_starter;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import oit.iloop.kiosk.kiosk_main.KioskMain;
import oit.iloop.kiosk.kiosk_main.KioskMain.dispMode;
import oit.iloop.kiosk.kiosk_toppage.TopPageParent;

public class KioskStarter extends Application {

	TopPageParent tpParent;

	@Override
	public void start(final Stage primaryStage) throws Exception {

		Parent root = new TopPageParent(new KioskMain());

		root.setScaleX(1);
		root.setScaleY(1);
		root.setTranslateX(0);
		root.setTranslateY(0);
		Scene scene = new Scene(root);

		primaryStage.addEventHandler(KeyEvent.ANY,
				new EventHandler<KeyEvent>() {

					@Override
					public void handle(KeyEvent arg0) {
						// TODO Auto-generated method stub
						if (arg0.isAltDown()) {
							if (arg0.getCode().equals(KeyCode.ENTER)) {
								primaryStage.setFullScreen(!primaryStage
										.isFullScreen());
							}
						}
					}

				});

		primaryStage.setFullScreen(true);

		primaryStage.setResizable(false);

		primaryStage.setScene(scene);

		primaryStage.show();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
