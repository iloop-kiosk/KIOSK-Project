package oit.iloop.kiosk.kiosk_main;

import java.net.URL;
import java.util.ResourceBundle;

import oit.iloop.kiosk.kiosk_timetable.TimeTableMainParent;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class KioskMainController implements Initializable {

	@FXML
	private Button tab_01;// 授業
	@FXML
	private Button tab_02;// テスト
	@FXML
	private Button tab_03;// バス
	@FXML
	private Button tab_04;// 学内地図
	@FXML
	private Button tab_05;// 自習室

	@FXML
	private Pane main_pane;

	@FXML
	private Pane main_clock;
	@FXML
	private Pane main_logo;

	private void setMainPane(Parent parent) {
		main_pane.getChildren().clear();
		main_pane.getChildren().add(parent);
	}
	private void setMainPane(){
		main_pane.getChildren().clear();
	}

	private EventHandler<MouseEvent> tab01Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				tab_01.setTextFill(Color.RED);
				tab_02.setTextFill(Color.BLACK);
				tab_03.setTextFill(Color.BLACK);
				tab_04.setTextFill(Color.BLACK);
				tab_05.setTextFill(Color.BLACK);
				
				setMainPane(new TimeTableMainParent());
			}
		}

	};
	private EventHandler<MouseEvent> tab02Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				tab_01.setTextFill(Color.BLACK);
				tab_02.setTextFill(Color.RED);
				tab_03.setTextFill(Color.BLACK);
				tab_04.setTextFill(Color.BLACK);
				tab_05.setTextFill(Color.BLACK);
				setMainPane();
			}
		}

	};
	private EventHandler<MouseEvent> tab03Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				tab_01.setTextFill(Color.BLACK);
				tab_02.setTextFill(Color.BLACK);
				tab_03.setTextFill(Color.RED);
				tab_04.setTextFill(Color.BLACK);
				tab_05.setTextFill(Color.BLACK);
				setMainPane();
			}
		}

	};
	private EventHandler<MouseEvent> tab04Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {

				tab_01.setTextFill(Color.BLACK);
				tab_02.setTextFill(Color.BLACK);
				tab_03.setTextFill(Color.BLACK);
				tab_04.setTextFill(Color.RED);
				tab_05.setTextFill(Color.BLACK);
				setMainPane();
			}
		}

	};
	private EventHandler<MouseEvent> tab05Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				tab_01.setTextFill(Color.BLACK);
				tab_02.setTextFill(Color.BLACK);
				tab_03.setTextFill(Color.BLACK);
				tab_04.setTextFill(Color.BLACK);
				tab_05.setTextFill(Color.RED);
				setMainPane();
			}
		}

	};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		tab_01.setText("授業");
		tab_01.addEventHandler(MouseEvent.ANY, tab01Handler);
		tab_02.setText("テスト");
		tab_02.addEventHandler(MouseEvent.ANY, tab02Handler);
		tab_03.setText("バス時刻表");
		tab_03.addEventHandler(MouseEvent.ANY, tab03Handler);
		tab_04.setText("学内地図");
		tab_04.addEventHandler(MouseEvent.ANY, tab04Handler);
		tab_05.setText("自習室");
		tab_05.addEventHandler(MouseEvent.ANY, tab05Handler);
		main_clock.autosize();
		
		
		System.out.println("main_clock:height = " + main_clock.getHeight()
				+ ", width = " + main_clock.getWidth());
		main_clock.getChildren().add(new MainClock(main_clock.getWidth(),main_clock.getHeight()));
		main_logo.getChildren().add(
				new ImageView(
						new Image(getClass().getClassLoader()
								.getResourceAsStream("mainlayout/ohit101.gif"),
								main_logo.getHeight(), main_logo.getWidth(),
								true, true)));

	}

}
