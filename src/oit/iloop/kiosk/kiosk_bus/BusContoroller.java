/**
 * バスページの動作コントロールクラス
 * */
package oit.iloop.kiosk.kiosk_bus;

/*SampleController.java は test.fxml 内に　
fx:controller="sample.SampleController と記入、指定が必要*/
/*style = "-fx-font-size : 70;" fxml　内でのテキストのフォントサイズの変更*/


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.text.Text;

public class BusContoroller {

//fxmlとのヒモ付
public TabPane TabsId;

public Tab KuzuhaBus;
public Tab NgaoBus;
public Tab NextBus;

public Text NextBusN;


//動作メソッド
public void TabEvent(ActionEvent e){

		}

public void TimeEvent() {
	Calendar timecall = Calendar.getInstance();
	
	Calendar bustime = Calendar.getInstance();
	bustime.add(Calendar.MINUTE, 15);
	
	long Tmin = timecall.getTimeInMillis();
	long Bmin = bustime.getTimeInMillis();
	
	long diff = (Bmin-Tmin)/(60*1000);

	Date date;
	SimpleDateFormat sdf = new SimpleDateFormat("MM");

	
	String time = sdf.format(timecall.getTime());
	
/*	System.out.println("bustime : "+bustime);
	System.out.println("timecall : "+timecall);
	System.out.println("time : "+time);
	System.out.println("diff : "+diff);*/
	
	/*int hour = timecall.get(Calendar.HOUR_OF_DAY);
	int min = timecall.get(Calendar.MINUTE);
	int sec = timecall.get(Calendar.SECOND);*/
	
	NextBusN.setText((diff)+"分後");
	
}

//@FXML
//protected void writeText(ActionEvent e) {
////	this.lblName.setText(this.txtName.getText());
//}
}