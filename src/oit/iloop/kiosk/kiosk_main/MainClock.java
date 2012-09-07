package oit.iloop.kiosk.kiosk_main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class MainClock extends AnchorPane {

	Calendar currentTime = Calendar.getInstance();
	SimpleDateFormat formatDate = new SimpleDateFormat("MM/dd (EEE)",
			Locale.JAPANESE);
	SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
	Label dateLabel = new Label();
	Label timeLabel = new Label();

	VBox container = new VBox();

	String style = "";
	AnchorPane mainClockRoot = new AnchorPane();

	public MainClock(double width, double height) {

		setStyle(style);

		dateLabel.setFont(new Font("SansSerif", 20));
		timeLabel.setFont(new Font("SansSerif", 30));

		refreshClock();
		container.setPrefHeight(height);
		container.setPrefWidth(width);

		container.getChildren().addAll(dateLabel, timeLabel);
		getChildren().add(container);
		clockStart();

	}

	public MainClock() {
		// TODO Auto-generated constructor stub
		this(200, 500);
	}

	public void refreshClock() {

		currentTime = Calendar.getInstance();
		String dateString = formatDate.format(currentTime.getTime());
		String timeString = formatTime.format(currentTime.getTime());
		dateLabel.setText(dateString);
		timeLabel.setText(timeString);

	}

	private Timeline delay, secondLine;

	public void clockStart() {

		delay = new Timeline();
		delay.getKeyFrames().add(
				new KeyFrame(new Duration(
						1000 - System.currentTimeMillis() % 1000),
						new EventHandler<ActionEvent>() {

							@Override
							public void handle(ActionEvent event) {

								if (secondLine != null) {
									secondLine.stop();
								}
								secondLine = new Timeline();
								secondLine.setCycleCount(Timeline.INDEFINITE);
								secondLine
										.getKeyFrames()
										.add(new KeyFrame(
												Duration.seconds(1),
												new EventHandler<ActionEvent>() {

													@Override
													public void handle(
															ActionEvent event) {

														refreshClock();
													}

												}));
								secondLine.play();
							}

						}));
		delay.play();

	}

	public void clockStop() {
		delay.stop();
		if (secondLine != null)
			secondLine.stop();
	}

}
