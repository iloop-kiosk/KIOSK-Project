package oit.iloop.kiosk.kiosk_main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import oit.iloop.kiosk.kiosk_main.KioskMain.dispMode;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import oit.iloop.kiosk.kiosk_bus.BusMain;
import oit.iloop.kiosk.kiosk_examination.ExaminationMain;
import oit.iloop.kiosk.kiosk_main.KioskMain.dispMode;
import oit.iloop.kiosk.kiosk_main.MainClock;
import oit.iloop.kiosk.kiosk_schoolmap.CampusMapMain;
import oit.iloop.kiosk.kiosk_timetable.TimeTableMain;
import oit.iloop.kiosk.kiosk_toppage.TopPageParent;

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
	private AnchorPane main_pane;

	@FXML
	private Pane main_clock;
	@FXML
	private Pane main_logo;
	Parent parent;

	BusMain busMain;
	TopPageParent topPageParent;
	CampusMapMain campusMapMain;
	TimeTableMain timeTableMain;
	ExaminationMain examinationMain;

	// StudyRoomMain studyRoomMain;
	public void setTopPageParent(TopPageParent topPage) {
		topPageParent = topPage;

		main_logo.addEventHandler(MouseEvent.MOUSE_CLICKED,
				new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						// TODO Auto-generated method stub
						parent.getScene().setRoot(topPageParent);
					}

				});

	}

	void setParent(Parent parent) {
		this.parent = parent;
	}

	public void setReturnTopEvenHandler(EventHandler<MouseEvent> event) {
		main_logo.addEventHandler(MouseEvent.MOUSE_CLICKED, event);
	}

	public void setMainPane(dispMode mode) {

		switch (mode) {
		case MODE_BUS:
			setMainPane(busMain);

			setButtonStyle(tab_03);
			break;
		case MODE_EXAMINATION:

			setMainPane(examinationMain);
			setButtonStyle(tab_02);
			break;
		case MODE_SCHOOLMAP:

			setMainPane(campusMapMain);
			setButtonStyle(tab_04);
			break;
		case MODE_STUDYROOM:
			setMainPane();
			setButtonStyle(tab_05);
			break;
		case MODE_TIMETABLE:

			setMainPane(timeTableMain);

			setButtonStyle(tab_01);
			break;
		case MODE_NON:
			setMainPane();
			break;
		default:
			setMainPane();
			break;

		}

	}

	private void setMainPane(Region parent) {
		main_pane.autosize();

		parent.autosize();
		double scaleX = main_pane.getWidth() / parent.getWidth();
		double diffWidth = main_pane.getWidth() - parent.getWidth();

		double scaleY = main_pane.getHeight() / parent.getHeight();
		double diffHeight = main_pane.getHeight() - parent.getHeight();

		System.out.println("main_pane.getWidth():" + main_pane.getWidth());
		System.out.println("main_pane.getHeight():" + main_pane.getHeight());
		System.out.println("parent.getWidth():" + parent.getWidth());
		System.out.println("parent.getHeight():" + parent.getHeight());
		System.out.println("diffWidth:  " + diffWidth);
		System.out.println("diffHeight: " + diffHeight);

		parent.setScaleX(scaleX);
		parent.setScaleY(scaleY);
		parent.setLayoutX(diffWidth / 2);
		parent.setLayoutY(diffHeight / 2);

		System.out.println("getLayoutX = ");

		parent.autosize();
		main_pane.getChildren().clear();
		main_pane.getChildren().add(parent);

	}

	private void setMainPane() {
		main_pane.getChildren().clear();
	}

	private void resetButton() {
		tab_01.setStyle("");
		tab_01.getStyleClass().clear();
		tab_01.getStyleClass().add("button");
		tab_02.setStyle("");
		tab_02.getStyleClass().clear();
		tab_02.getStyleClass().add("button");
		tab_03.setStyle("");
		tab_03.getStyleClass().clear();
		tab_03.getStyleClass().add("button");
		tab_04.setStyle("");
		tab_04.getStyleClass().clear();
		tab_04.getStyleClass().add("button");
		tab_05.setStyle("");
		tab_05.getStyleClass().clear();
		tab_05.getStyleClass().add("button");

	}

	private void setButtonStyle(Button selectedButton) {
		resetButton();
		selectedButton
				.setStyle("-fx-background-color: linear-gradient(to bottom, #b7deed 0%,#71ceef 50%,#21b4e2 51%,#b7deed 100%);"
						+ "	-fx-background-radius: 8 8 0 0;"
						+ "-fx-text-fill: orange;");
	}

	private EventHandler<MouseEvent> tab01Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {

				setMainPane(dispMode.MODE_TIMETABLE);
				setButtonStyle(tab_01);
			}
		}

	};
	private EventHandler<MouseEvent> tab02Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				setMainPane(dispMode.MODE_EXAMINATION);
				setButtonStyle(tab_02);

			}
		}

	};
	private EventHandler<MouseEvent> tab03Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {

				setMainPane(dispMode.MODE_BUS);
				setButtonStyle(tab_03);

			}
		}

	};
	private EventHandler<MouseEvent> tab04Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {

				setButtonStyle(tab_04);
				setMainPane(dispMode.MODE_SCHOOLMAP);
			}
		}

	};
	private EventHandler<MouseEvent> tab05Handler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			// TODO Auto-generated method stub
			if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
				setButtonStyle(tab_05);
				setMainPane(dispMode.MODE_STUDYROOM);
			}
		}

	};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		try {

			campusMapMain = new CampusMapMain();
			timeTableMain = new TimeTableMain();
			examinationMain = new ExaminationMain();

			busMain = new BusMain();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		main_clock.getChildren().add(
				new MainClock(main_clock.getWidth(), main_clock.getHeight()));
		main_logo.getChildren().add(
				new ImageView(
						new Image(getClass().getClassLoader()
								.getResourceAsStream("mainlayout/ohit101.png"),
								main_logo.getHeight(), main_logo.getWidth(),
								true, true)));

	}

}
